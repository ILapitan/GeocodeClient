package by.aboutme.geocode;


import by.aboutme.geocode.cache.GeoCache;
import by.aboutme.geocode.jaxb.GeocodeResponse;
import org.apache.log4j.Logger;
import org.springframework.web.client.RestTemplate;

/**
 * Client class for work with geocode service.
 *
 * @author ilya.lapitan@gmail.com
 */
public class GeoCodeClient {
    private static final Logger LOG = Logger.getLogger(GeoCodeClient.class);

    private final RestTemplate client;
    private final GeoCache<Object, GeocodeResponse> cache;

    /**
     * Constructor with param to setup cache size.
     * @param cacheSize - cache size.
     */
    private GeoCodeClient(final int cacheSize) {
        cache = new GeoCache<>(cacheSize);
        client = new RestTemplate();
    }

    /**
     * Create GeoCodeClient class with fixed cache size.
     * @param cacheSize - cache size.
     * @return GeoCodeClient
     */
    public static GeoCodeClient createGeoCodeClient(final int cacheSize) {
        return new GeoCodeClient(cacheSize);
    }

    /**
     * Get geocode for location
     * @param location - location
     * @return GeocodeResponse
     */
    public GeocodeResponse getGeoCode(Object location){
        GeocodeResponse response = cache.get(location);
        if(response == null){
            LOG.debug("Send request to GeoCode server for location: " + location);
            response = client.getForObject("https://maps.googleapis.com/maps/api/geocode/xml?address={address}&key={apiKey}",
                    GeocodeResponse.class,
                    location,
                    "!!!PUT_HERE_YOUR_GOOGLE_API_KEY!!!");
            cache.put(location, response);
        }
        return response;
    }
}

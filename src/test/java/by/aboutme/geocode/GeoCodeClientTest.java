package by.aboutme.geocode;

import by.aboutme.geocode.constant.GeoCodeResponseCode;
import by.aboutme.geocode.jaxb.GeocodeResponse;
import org.apache.log4j.Logger;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Test class for GeoCodeClient class testing.
 * (just show that it works)
 */
public class GeoCodeClientTest {

    private static final Logger LOG = Logger.getLogger(GeoCodeClientTest.class);

    @Test()
    public void testClient(){
        //prepare input data for testing
        String[] addresses = new String[]{
                "Hamburg",
                "Prague",
                "San Francisco",
                "Hamburg","Alviso"
        };

        GeoCodeClient  client = GeoCodeClient.createGeoCodeClient(10);

        for(String address : addresses) {
            LOG.debug("Getting geocode for location: " + address);
            GeocodeResponse response = client.getGeoCode(address);
            //check that response was processed without problems
            assertThat(response.getStatus(), equalTo(GeoCodeResponseCode.OK.code()));
            assertNotNull(response.getResult());
            LOG.debug(response);
        }
    }
}

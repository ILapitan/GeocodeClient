package by.aboutme.geocode.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Represent Northeast element in the response.
 */
@XmlType
public class Northeast {
    Double lat;
    Double lng;

    public Double getLat() {
        return lat;
    }

    @XmlElement(name = "lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    @XmlElement(name = "lng")
    public void setLng(Double lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Northeast{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}

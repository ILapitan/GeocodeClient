package by.aboutme.geocode.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Represent Geometry element in the response.
 */
@XmlType
public class Geometry {
    Location location;
    String locationType;
    ViewPort viewPort;
    Bounds bounds;

    public Location getLocation() {
        return location;
    }

    @XmlElement(name = "location")
    public void setLocation(Location location) {
        this.location = location;
    }

    public String getLocationType() {
        return locationType;
    }

    @XmlElement(name = "location_type")
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public ViewPort getViewPort() {
        return viewPort;
    }

    @XmlElement(name = "viewport")
    public void setViewPort(ViewPort viewPort) {
        this.viewPort = viewPort;
    }

    public Bounds getBounds() {
        return bounds;
    }

    @XmlElement(name = "bounds")
    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }

    @Override
    public String toString() {
        return "Geometry{" +
                "location=" + location +
                ", locationType='" + locationType + '\'' +
                ", viewPort=" + viewPort +
                ", bounds=" + bounds +
                '}';
    }
}

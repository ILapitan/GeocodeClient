package by.aboutme.geocode.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Represent ViewPost element in the response.
 */
@XmlType
public class ViewPort {
    Southwest southwest;
    Northeast northeast;

    public Southwest getSouthwest() {
        return southwest;
    }

    @XmlElement(name = "southwest")
    public void setSouthwest(Southwest southwest) {
        this.southwest = southwest;
    }

    public Northeast getNortheast() {
        return northeast;
    }

    @XmlElement(name = "northeast")
    public void setNortheast(Northeast northeast) {
        this.northeast = northeast;
    }

    @Override
    public String toString() {
        return "ViewPort{" +
                "southwest=" + southwest +
                ", northeast=" + northeast +
                '}';
    }
}

package by.aboutme.geocode.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Represent AddressComponent element in the response.
 */
@XmlType
public class AddressComponent {
    String longName;
    String shortName;
    List<String> type;

    public String getLongName() {
        return longName;
    }

    @XmlElement(name = "long_name")
    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getShortName() {
        return shortName;
    }

    @XmlElement(name = "short_name")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public List<String> getType() {
        return type;
    }

    @XmlElement(name = "type")
    public void setType(List<String> type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AddressComponent{" +
                "longName='" + longName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", type=" + type +
                '}';
    }
}

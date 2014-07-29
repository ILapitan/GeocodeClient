package by.aboutme.geocode.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Represent Result element in the response.
 */
@XmlType
public class Result {
    List<String> type;
    String formattedAddress;
    List<AddressComponent> addressComponents;
    Geometry geometry;

    public List<String> getType() {
        return type;
    }

    @XmlElement(name = "type")
    public void setType(List<String> type) {
        this.type = type;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    @XmlElement(name = "formatted_address")
    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }


    public List<AddressComponent> getAddressComponents() {
        return addressComponents;
    }

    @XmlElement(name = "address_component")
    public void setAddressComponents(List<AddressComponent> addressComponents) {
        this.addressComponents = addressComponents;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    @XmlElement(name = "geometry")
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }


    @Override
    public String toString() {
        return "Result{" +
                "type='" + type + '\'' +
                ", formattedAddress='" + formattedAddress + '\'' +
                ", addressComponents=" + addressComponents +
                ", geometry=" + geometry +
                '}';
    }
}

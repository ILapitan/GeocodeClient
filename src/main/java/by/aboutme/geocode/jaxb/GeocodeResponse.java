package by.aboutme.geocode.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Represent response from the geocode service.
 */
@XmlRootElement(name = "GeocodeResponse")
public class GeocodeResponse {
    String status;
    Result result;

    public String getStatus() {
        return status;
    }

    @XmlElement(name = "status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Result getResult() {
        return result;
    }

    @XmlElement(name = "result")
    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "GeocodeResponse{" +
                "status='" + status + '\'' +
                ", result=" + result +
                '}';
    }
}

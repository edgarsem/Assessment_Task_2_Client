
package lt.viko.eif.esemasko.soap;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="averageRating" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "averageRating"
})
@XmlRootElement(name = "getAverageRatingResponse")
public class GetAverageRatingResponse {

    protected double averageRating;

    /**
     * Gets the value of the averageRating property.
     */
    public double getAverageRating() {
        return averageRating;
    }

    /**
     * Sets the value of the averageRating property.
     */
    public void setAverageRating(double value) {
        this.averageRating = value;
    }

}

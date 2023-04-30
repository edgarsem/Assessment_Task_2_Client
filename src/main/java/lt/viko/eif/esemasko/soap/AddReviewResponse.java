
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
 *         &lt;element name="addedReview" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "addedReview"
})
@XmlRootElement(name = "addReviewResponse")
public class AddReviewResponse {

    protected boolean addedReview;

    /**
     * Gets the value of the addedReview property.
     */
    public boolean isAddedReview() {
        return addedReview;
    }

    /**
     * Sets the value of the addedReview property.
     */
    public void setAddedReview(boolean value) {
        this.addedReview = value;
    }

}

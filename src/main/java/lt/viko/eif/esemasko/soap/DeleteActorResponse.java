
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
 *         &lt;element name="deleteActor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deleteActor"
})
@XmlRootElement(name = "deleteActorResponse")
public class DeleteActorResponse {

    protected boolean deleteActor;

    /**
     * Gets the value of the deleteActor property.
     */
    public boolean isDeleteActor() {
        return deleteActor;
    }

    /**
     * Sets the value of the deleteActor property.
     */
    public void setDeleteActor(boolean value) {
        this.deleteActor = value;
    }

}

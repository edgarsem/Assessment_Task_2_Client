
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
 *         &lt;element name="actorId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="actor" type="{http://spring.io/guides/gs-producing-web-service}actor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "actorId",
        "actor"
})
@XmlRootElement(name = "changeActorRequest")
public class ChangeActorRequest {

    protected int actorId;
    @XmlElement(required = true)
    protected Actor actor;

    /**
     * Gets the value of the actorId property.
     */
    public int getActorId() {
        return actorId;
    }

    /**
     * Sets the value of the actorId property.
     */
    public void setActorId(int value) {
        this.actorId = value;
    }

    /**
     * Gets the value of the actor property.
     *
     * @return possible object is
     * {@link Actor }
     */
    public Actor getActor() {
        return actor;
    }

    /**
     * Sets the value of the actor property.
     *
     * @param value allowed object is
     *              {@link Actor }
     */
    public void setActor(Actor value) {
        this.actor = value;
    }

}

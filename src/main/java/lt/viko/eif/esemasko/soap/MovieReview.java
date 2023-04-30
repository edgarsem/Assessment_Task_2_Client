
package lt.viko.eif.esemasko.soap;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for movieReview complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="movieReview">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="criticism" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="user" type="{http://spring.io/guides/gs-producing-web-service}user"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movieReview", propOrder = {
        "id",
        "criticism",
        "rating",
        "user"
})
public class MovieReview {

    protected byte id;
    @XmlElement(required = true)
    protected String criticism;
    protected byte rating;
    @XmlElement(required = true)
    protected User user;

    /**
     * Gets the value of the id property.
     */
    public byte getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setId(byte value) {
        this.id = value;
    }

    /**
     * Gets the value of the criticism property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCriticism() {
        return criticism;
    }

    /**
     * Sets the value of the criticism property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCriticism(String value) {
        this.criticism = value;
    }

    /**
     * Gets the value of the rating property.
     */
    public byte getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     */
    public void setRating(byte value) {
        this.rating = value;
    }

    /**
     * Gets the value of the user property.
     *
     * @return possible object is
     * {@link User }
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     *
     * @param value allowed object is
     *              {@link User }
     */
    public void setUser(User value) {
        this.user = value;
    }

}

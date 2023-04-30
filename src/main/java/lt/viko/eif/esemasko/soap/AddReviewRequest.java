
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
 *         &lt;element name="movieId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="criticism" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "movieId",
        "criticism",
        "rating",
        "userId"
})
@XmlRootElement(name = "addReviewRequest")
public class AddReviewRequest {

    protected int movieId;
    @XmlElement(required = true)
    protected String criticism;
    protected int rating;
    protected int userId;

    /**
     * Gets the value of the movieId property.
     */
    public int getMovieId() {
        return movieId;
    }

    /**
     * Sets the value of the movieId property.
     */
    public void setMovieId(int value) {
        this.movieId = value;
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
    public int getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     */
    public void setRating(int value) {
        this.rating = value;
    }

    /**
     * Gets the value of the userId property.
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     */
    public void setUserId(int value) {
        this.userId = value;
    }

}


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
 *         &lt;element name="movieTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="director" type="{http://spring.io/guides/gs-producing-web-service}director"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "movieTitle",
        "director"
})
@XmlRootElement(name = "addDirectorRequest")
public class AddDirectorRequest {

    @XmlElement(required = true)
    protected String movieTitle;
    @XmlElement(required = true)
    protected Director director;

    /**
     * Gets the value of the movieTitle property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMovieTitle() {
        return movieTitle;
    }

    /**
     * Sets the value of the movieTitle property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMovieTitle(String value) {
        this.movieTitle = value;
    }

    /**
     * Gets the value of the director property.
     *
     * @return possible object is
     * {@link Director }
     */
    public Director getDirector() {
        return director;
    }

    /**
     * Sets the value of the director property.
     *
     * @param value allowed object is
     *              {@link Director }
     */
    public void setDirector(Director value) {
        this.director = value;
    }

}

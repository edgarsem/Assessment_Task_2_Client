
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
 *         &lt;element name="movie" type="{http://spring.io/guides/gs-producing-web-service}movie"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "movie"
})
@XmlRootElement(name = "getMovieResponse")
public class GetMovieResponse {

    @XmlElement(required = true)
    protected Movie movie;

    /**
     * Gets the value of the movie property.
     *
     * @return possible object is
     * {@link Movie }
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Sets the value of the movie property.
     *
     * @param value allowed object is
     *              {@link Movie }
     */
    public void setMovie(Movie value) {
        this.movie = value;
    }

}

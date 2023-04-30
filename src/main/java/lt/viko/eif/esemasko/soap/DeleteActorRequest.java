
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
 *         &lt;element name="actorId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "movieId",
        "actorId"
})
@XmlRootElement(name = "deleteActorRequest")
public class DeleteActorRequest {

    protected int movieId;
    protected int actorId;

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

}

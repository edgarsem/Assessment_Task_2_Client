
package lt.viko.eif.esemasko.soap;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="allMovies" type="{http://spring.io/guides/gs-producing-web-service}movie" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "allMovies"
})
@XmlRootElement(name = "getAllMoviesResponse")
public class GetAllMoviesResponse {

    @XmlElement(required = true)
    protected List<Movie> allMovies;

    /**
     * Gets the value of the allMovies property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allMovies property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllMovies().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Movie }
     */
    public List<Movie> getAllMovies() {
        if (allMovies == null) {
            allMovies = new ArrayList<Movie>();
        }
        return this.allMovies;
    }

}

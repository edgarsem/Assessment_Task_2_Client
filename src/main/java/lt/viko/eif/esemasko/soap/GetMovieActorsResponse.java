
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
 *         &lt;element name="getMovieActorsReturn" type="{http://spring.io/guides/gs-producing-web-service}actor" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getMovieActorsReturn"
})
@XmlRootElement(name = "getMovieActorsResponse")
public class GetMovieActorsResponse {

    @XmlElement(required = true)
    protected List<Actor> getMovieActorsReturn;

    /**
     * Gets the value of the getMovieActorsReturn property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getMovieActorsReturn property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetMovieActorsReturn().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Actor }
     */
    public List<Actor> getGetMovieActorsReturn() {
        if (getMovieActorsReturn == null) {
            getMovieActorsReturn = new ArrayList<Actor>();
        }
        return this.getMovieActorsReturn;
    }

}

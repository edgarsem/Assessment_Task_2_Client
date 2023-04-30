
package lt.viko.eif.esemasko.soap;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for movie complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="movie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="genres" type="{http://spring.io/guides/gs-producing-web-service}genre" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="directors" type="{http://spring.io/guides/gs-producing-web-service}director" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="writers" type="{http://spring.io/guides/gs-producing-web-service}writer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cast" type="{http://spring.io/guides/gs-producing-web-service}actor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reviews" type="{http://spring.io/guides/gs-producing-web-service}movieReview" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movie", propOrder = {
        "id",
        "title",
        "length",
        "genres",
        "directors",
        "writers",
        "cast",
        "reviews"
})
public class Movie {
    @XmlAttribute(name = "id")
    protected byte id;
    @XmlElement(required = true)
    protected String title;
    @XmlElement
    protected short length;
    @XmlElementWrapper(name = "genres")
    @XmlElement(name = "genre")
    protected List<Genre> genres;
    @XmlElementWrapper(name = "directors")
    @XmlElement(name = "director")
    protected List<Director> directors;
    @XmlElementWrapper(name = "writers")
    @XmlElement(name = "writer")
    protected List<Writer> writers;
    @XmlElementWrapper(name = "cast")
    @XmlElement(name = "actor")
    protected List<Actor> cast;
    @XmlElementWrapper(name = "reviews")
    @XmlElement(name = "review")
    protected List<MovieReview> reviews;

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
     * Gets the value of the title property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the length property.
     */
    public short getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     */
    public void setLength(short value) {
        this.length = value;
    }

    /**
     * Gets the value of the genres property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genres property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenres().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Genre }
     */
    public List<Genre> getGenres() {
        if (genres == null) {
            genres = new ArrayList<Genre>();
        }
        return this.genres;
    }

    /**
     * Gets the value of the directors property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directors property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectors().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Director }
     */
    public List<Director> getDirectors() {
        if (directors == null) {
            directors = new ArrayList<Director>();
        }
        return this.directors;
    }

    /**
     * Gets the value of the writers property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the writers property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWriters().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Writer }
     */
    public List<Writer> getWriters() {
        if (writers == null) {
            writers = new ArrayList<Writer>();
        }
        return this.writers;
    }

    /**
     * Gets the value of the cast property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cast property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCast().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Actor }
     */
    public List<Actor> getCast() {
        if (cast == null) {
            cast = new ArrayList<Actor>();
        }
        return this.cast;
    }

    /**
     * Gets the value of the reviews property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reviews property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReviews().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MovieReview }
     */
    public List<MovieReview> getReviews() {
        if (reviews == null) {
            reviews = new ArrayList<MovieReview>();
        }
        return this.reviews;
    }

}

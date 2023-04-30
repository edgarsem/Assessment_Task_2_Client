package lt.viko.eif.esemasko.soap;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * This class stores movies list.
 * This class has one parameter: movieList.
 *
 * @version 1.0
 * @since 1.0
 */
@XmlRootElement(name = "movies")
@XmlAccessorType(XmlAccessType.FIELD)
public class MovieList {
    @XmlElement(name = "movie")
    private List<Movie> movies;

    /**
     * Constructor for MovieList class.
     */
    public MovieList() {
        movies = new ArrayList<>();
    }

    /**
     * Gets the value of the movies property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the movies property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMovies().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Movie }s
     */
    public List<Movie> getMovies() {
        return movies;
    }

    /**
     * Sets the value of the movies property.
     *
     * @param movies allowed object is
     *               {@link Movie }
     */
    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
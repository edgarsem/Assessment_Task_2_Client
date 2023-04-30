package lt.viko.eif.esemasko.soap;

import lt.viko.eif.esemasko.soap.utils.*;
import org.apache.fop.apps.FOPException;

import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

/**
 * The SoapClient class contains the main method that is a scenario of
 * various operations performed using the  web service.
 * <p>
 * This class shows how to interact with the web service to perform
 * actions like getting all movies, adding a director, changing an actor,
 * deleting an actor, adding a review, getting the average rating,
 * getting movies by genre, and adding a new movie. It also transforms
 * the initial received movie list, transforms it into XML format, and then
 * into PDF format. New PDF file is generated with movie list after all changes
 * done to it, like adding new director, deleting actor, adding new movie, etc..
 * </p>
 *
 * @author [Your Name]
 * @version 1.0
 * @since 1.0
 */
public class SoapClient {
    /**
     * The main method that demonstrates various operations performed
     * with web service.
     *
     * @param args - command-line arguments (not used in this application)
     * @throws FOPException         - if there is an error during the PDF generation process
     * @throws IOException          - if there is an I/O error during the transformation or file operations
     * @throws TransformerException - if there is an error during the XML transformation process
     */
    public static void main(String[] args) throws FOPException, IOException, TransformerException {
        MoviesPortService service = new MoviesPortService();
        MoviesPort port = service.getMoviesPortSoap11();

        GetAllMoviesRequest request = new GetAllMoviesRequest();
        GetAllMoviesResponse response = port.getAllMovies(request);
        MovieList moviesList = new MovieList();
        moviesList.setMovies(response.getAllMovies());
        JAXBUtil.transformToXML(moviesList);

        MoviesToPDF.convertToPDF("movies.pdf");

        AddDirectorRequest request1 = new AddDirectorRequest();
        request1.setMovieTitle("Avengers: Infinity War");
        Director tempDirector = new Director();
        tempDirector.setId((byte) 99);
        tempDirector.setName("Kevin");
        tempDirector.setLastName("Feige");
        request1.setDirector(tempDirector);
        AddDirectorResponse response1 = port.addDirector(request1);
        if (response1.isAddedDirector())
            System.out.println("Director added successfully!");
        else
            System.out.println("Director was not added!");


        ChangeActorRequest request2 = new ChangeActorRequest();
        Actor tempActor = new Actor();
        tempActor.setId((byte) 99);
        tempActor.setName("Mark");
        tempActor.setLastName("Ruffalo");
        tempActor.setAge((byte) 55);
        request2.setActorId(4);
        request2.setActor(tempActor);
        ChangeActorResponse response2 = port.changeActor(request2);
        if (response2.getActor().getName().equals(tempActor.getName()) &&
                response2.getActor().getLastName().equals(tempActor.getLastName()))
            System.out.println("New actor:" + response2.getActor().getName() + " " + response2.getActor().getLastName() + " was added successfully!");
        else
            System.out.println("Actor was not added!");


        DeleteActorRequest request3 = new DeleteActorRequest();
        request3.setMovieId(1);
        request3.setActorId(6);
        DeleteActorResponse response3 = port.deleteActor(request3);
        if (response3.isDeleteActor())
            System.out.println("Actor by ID " + 6 + " was deleted successfully!");
        else
            System.out.println("Actor was not deleted!");


        AddReviewRequest request4 = new AddReviewRequest();
        request4.setMovieId(1);
        request4.setCriticism("I enjoyed this movie A LOT!");
        request4.setRating(10);
        request4.setUserId(1);
        AddReviewResponse response4 = port.addReview(request4);

        if (response4.isAddedReview())
            System.out.println("Review was added successfully!");
        else
            System.out.println("Review was not added!");


        GetAverageRatingRequest request5 = new GetAverageRatingRequest();
        request5.setMovieTitle("Avengers: Infinity War");
        GetAverageRatingResponse response5 = port.getAverageRating(request5);
        System.out.println("Average rating of Avengers: Infinity War is: " + response5.getAverageRating());


        GetMoviesByGenreRequest request6 = new GetMoviesByGenreRequest();
        request6.setGenre("Comedy");
        GetMoviesByGenreResponse response6 = port.getMoviesByGenre(request6);
        List<String> tempMoviesList = response6.getMoviesByGenre();
        System.out.println("Comedy movies:");
        System.out.println(tempMoviesList.toString());


        Movie newMovie = MovieConstr.newMovie(moviesList);

        AddMovieRequest request7 = new AddMovieRequest();
        request7.setMovie(newMovie);
        AddMovieResponse response7 = port.addMovie(request7);
        if (response7.isIsAdded())
            System.out.println("Movie was added successfully!");
        else
            System.out.println("Movie was not added!");


        GetAllMoviesRequest request8 = new GetAllMoviesRequest();
        GetAllMoviesResponse response8 = port.getAllMovies(request8);
        MovieList newMoviesList = new MovieList();
        newMoviesList.setMovies(response8.getAllMovies());
        JAXBUtil.transformToXML(newMoviesList);

        MoviesToPDF.convertToPDF("newMovies.pdf");

    }
}

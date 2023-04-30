package lt.viko.eif.esemasko.soap;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AddMovieTest {
    private static final Movie movie = new Movie();

    @Before
    public void setUp() {
        Genre comedy = new Genre();
        comedy.setId((byte) 0);
        comedy.setCategory("Comedy");

        Genre action = new Genre();
        action.setId((byte) 1);
        action.setCategory("Action");

        Genre adventure = new Genre();
        adventure.setId((byte) 2);
        adventure.setCategory("Adventure");

        Director danielKwanD = new Director();
        danielKwanD.setId((byte) 0);
        danielKwanD.setName("Daniel");
        danielKwanD.setLastName("Kwan");

        Director danielScheinertD = new Director();
        danielScheinertD.setId((byte) 1);
        danielScheinertD.setName("Daniel");
        danielScheinertD.setLastName("Scheinert");

        Writer danielKwanW = new Writer();
        danielKwanW.setId((byte) 0);
        danielKwanW.setName("Daniel");
        danielKwanW.setLastName("Kwan");

        Writer danielScheinertW = new Writer();
        danielScheinertW.setId((byte) 1);
        danielScheinertW.setName("Daniel");
        danielScheinertW.setLastName("Scheinert");

        Actor michelleYeoh = new Actor();
        michelleYeoh.setId((byte) 0);
        michelleYeoh.setName("Michelle");
        michelleYeoh.setLastName("Yeoh");
        michelleYeoh.setAge((byte) 60);

        Actor jamieLeeCurtis = new Actor();
        jamieLeeCurtis.setId((byte) 1);
        jamieLeeCurtis.setName("Jamie Lee");
        jamieLeeCurtis.setLastName("Curtis");
        jamieLeeCurtis.setAge((byte) 64);

        Actor keHuyQuan = new Actor();
        keHuyQuan.setId((byte) 2);
        keHuyQuan.setName("Ke Huy");
        keHuyQuan.setLastName("Quan");
        keHuyQuan.setAge((byte) 51);

        Actor stephanieHsu = new Actor();
        stephanieHsu.setId((byte) 3);
        stephanieHsu.setName("Stephanie");
        stephanieHsu.setLastName("Hsu");
        stephanieHsu.setAge((byte) 32);

        User user1 = new User();
        user1.setId((byte) 0);
        user1.setName("Edgar");
        user1.setLastName("Semasko");

        User user2 = new User();
        user2.setId((byte) 1);
        user2.setName("John");
        user2.setLastName("Doe");


        MovieReview review1 = new MovieReview();
        review1.setId((byte) 0);
        review1.setRating((byte) 10);
        review1.setCriticism("This movie is awesome.");
        review1.setUser(user1);

        MovieReview review2 = new MovieReview();
        review2.setId((byte) 1);
        review2.setRating((byte) 9);
        review2.setCriticism("I really like this movie.");
        review2.setUser(user2);

        movie.setId((byte) 0);
        movie.setTitle("Everything Everywhere All at Once");
        movie.setLength((short) 140);
        movie.getGenres().addAll(List.of(comedy, action, adventure));
        movie.getDirectors().addAll(List.of(danielKwanD, danielScheinertD));
        movie.getWriters().addAll(List.of(danielKwanW, danielScheinertW));
        movie.getCast().addAll(List.of(michelleYeoh, jamieLeeCurtis, keHuyQuan, stephanieHsu));
        movie.getReviews().addAll(List.of(review1, review2));

    }

    @Test
    public void EndpointTest() {
        MoviesPortService service = new MoviesPortService();
        MoviesPort port = service.getMoviesPortSoap11();
        AddMovieRequest request7 = new AddMovieRequest();
        request7.setMovie(movie);
        AddMovieResponse response7 = port.addMovie(request7);
        assertTrue(response7.isIsAdded());
    }
}
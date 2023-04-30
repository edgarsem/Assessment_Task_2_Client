package lt.viko.eif.esemasko.soap;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetAverageRatingTest {
    @Test
    public void EndpointTest() {
        MoviesPortService service = new MoviesPortService();
        MoviesPort port = service.getMoviesPortSoap11();
        GetAverageRatingRequest request5 = new GetAverageRatingRequest();
        request5.setMovieTitle("Avengers: Infinity War");
        GetAverageRatingResponse response5 = port.getAverageRating(request5);
        assertEquals(9.3, response5.getAverageRating(), 0.0000001);

        request5.setMovieTitle("Avengers");
        response5 = port.getAverageRating(request5);
        assertEquals(0.0, response5.getAverageRating(), 0.0000001);
    }

}
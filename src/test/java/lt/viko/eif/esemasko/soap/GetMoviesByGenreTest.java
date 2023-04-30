package lt.viko.eif.esemasko.soap;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GetMoviesByGenreTest {
    @Test
    public void EndpointTest() {
        MoviesPortService service = new MoviesPortService();
        MoviesPort port = service.getMoviesPortSoap11();
        GetMoviesByGenreRequest request = new GetMoviesByGenreRequest();
        request.setGenre("Action");
        GetMoviesByGenreResponse response = port.getMoviesByGenre(request);
        assertEquals("Everything Everywhere All at Once", response.getMoviesByGenre().get(0));
        assertEquals("Avengers: Infinity War", response.getMoviesByGenre().get(1));

        request.setGenre("Animation");
        response = port.getMoviesByGenre(request);
        assertEquals(new ArrayList<>(), response.getMoviesByGenre());
    }

}
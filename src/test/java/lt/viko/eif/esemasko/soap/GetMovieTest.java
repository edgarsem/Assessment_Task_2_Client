package lt.viko.eif.esemasko.soap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GetMovieTest {
    @Test
    public void EndpointTest() {
        MoviesPortService service = new MoviesPortService();
        MoviesPort port = service.getMoviesPortSoap11();
        GetMovieRequest request = new GetMovieRequest();
        request.setName("Avengers: Infinity War");
        GetMovieResponse response = port.getMovie(request);
        assertEquals("Avengers: Infinity War", response.getMovie().getTitle());
        request.setName("Avengers");
        response = port.getMovie(request);
        assertNull(response.getMovie());
    }

}
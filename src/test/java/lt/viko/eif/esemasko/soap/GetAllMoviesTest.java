package lt.viko.eif.esemasko.soap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GetAllMoviesTest {
    @Test
    public void EndpointTest() {
        MoviesPortService service = new MoviesPortService();
        MoviesPort port = service.getMoviesPortSoap11();
        GetAllMoviesRequest request = new GetAllMoviesRequest();
        GetAllMoviesResponse response = port.getAllMovies(request);
        assertEquals("Everything Everywhere All at Once", response.getAllMovies().get(0).getTitle());
        assertEquals("Avengers: Infinity War", response.getAllMovies().get(1).getTitle());

    }

}
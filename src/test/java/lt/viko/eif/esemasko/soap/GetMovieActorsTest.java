package lt.viko.eif.esemasko.soap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GetMovieActorsTest {
    @Test
    public void EndpointTest() {
        MoviesPortService service = new MoviesPortService();
        MoviesPort port = service.getMoviesPortSoap11();
        GetMovieActorsRequest request = new GetMovieActorsRequest();
        request.setMovieTitle("Avengers: Infinity War");
        GetMovieActorsResponse response = port.getMovieActors(request);
        assertEquals("Robert", response.getGetMovieActorsReturn().get(0).getName());
        assertEquals("Downey Jr.", response.getGetMovieActorsReturn().get(0).getLastName());
        assertEquals("Chris", response.getGetMovieActorsReturn().get(1).getName());
        assertEquals("Evens", response.getGetMovieActorsReturn().get(1).getLastName());

        request.setMovieTitle("The Super Mario Bros. Movie");
        response = port.getMovieActors(request);
        assertEquals(new ArrayList<>(), response.getGetMovieActorsReturn());

    }

}
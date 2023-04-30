package lt.viko.eif.esemasko.soap;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddDirectorTest {
    @Test
    public void EndpointTest() {
        MoviesPortService service = new MoviesPortService();
        MoviesPort port = service.getMoviesPortSoap11();
        AddDirectorRequest request1 = new AddDirectorRequest();
        request1.setMovieTitle("Avengers: Infinity War");
        Director tempDirector = new Director();
        tempDirector.setId((byte) 99);
        tempDirector.setName("Kevin");
        tempDirector.setLastName("Feige");
        request1.setDirector(tempDirector);
        AddDirectorResponse response1 = port.addDirector(request1);
        assertTrue(response1.isAddedDirector());

        request1.setMovieTitle("Avengers");
        response1 = port.addDirector(request1);
        assertFalse(response1.isAddedDirector());
    }
}
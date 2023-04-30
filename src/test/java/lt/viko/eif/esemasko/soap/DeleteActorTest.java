package lt.viko.eif.esemasko.soap;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteActorTest {
    @Test
    public void EndpointTest() {
        MoviesPortService service = new MoviesPortService();
        MoviesPort port = service.getMoviesPortSoap11();
        DeleteActorRequest request3 = new DeleteActorRequest();
        request3.setMovieId(1);
        request3.setActorId(6);
        DeleteActorResponse response3 = port.deleteActor(request3);
        assertTrue(response3.isDeleteActor());

        request3.setMovieId(2);
        response3 = port.deleteActor(request3);
        assertFalse(response3.isDeleteActor());

        request3.setMovieId(1);
        request3.setActorId(12);
        response3 = port.deleteActor(request3);
        assertFalse(response3.isDeleteActor());
    }

}
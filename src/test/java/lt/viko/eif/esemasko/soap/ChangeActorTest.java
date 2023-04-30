package lt.viko.eif.esemasko.soap;


import org.junit.Test;

import static org.junit.Assert.*;

public class ChangeActorTest {


    @Test
    public void EndpointTest() {
        MoviesPortService service = new MoviesPortService();
        MoviesPort port = service.getMoviesPortSoap11();
        ChangeActorRequest request2 = new ChangeActorRequest();
        Actor tempActor = new Actor();
        tempActor.setId((byte) 99);
        tempActor.setName("Mark");
        tempActor.setLastName("Ruffalo");
        tempActor.setAge((byte) 55);
        request2.setActorId(7);
        request2.setActor(tempActor);
        ChangeActorResponse response2 = port.changeActor(request2);

        assertEquals(tempActor.getName(), response2.getActor().getName());
        assertEquals(tempActor.getLastName(), response2.getActor().getLastName());
        assertEquals(tempActor.getAge(), response2.getActor().getAge());

        request2.setActorId(12);
        response2 = port.changeActor(request2);

        assertNull(response2.getActor());
        assertNull(response2.getActor());
        assertNull(response2.getActor());
    }
}
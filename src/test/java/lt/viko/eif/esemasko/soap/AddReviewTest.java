package lt.viko.eif.esemasko.soap;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddReviewTest {

    @Test
    public void EndpointTest() {
        MoviesPortService service = new MoviesPortService();
        MoviesPort port = service.getMoviesPortSoap11();
        AddReviewRequest request4 = new AddReviewRequest();
        request4.setMovieId(1);
        request4.setCriticism("I enjoyed this movie A LOT!");
        request4.setRating(10);
        request4.setUserId(1);
        AddReviewResponse response4 = port.addReview(request4);
        assertTrue(response4.isAddedReview());

        request4.setMovieId(2);
        response4 = port.addReview(request4);
        assertFalse(response4.isAddedReview());

        request4.setMovieId(1);
        request4.setUserId(2);
        response4 = port.addReview(request4);
        assertFalse(response4.isAddedReview());
    }
}
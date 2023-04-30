package lt.viko.eif.esemasko.soap.utils;

import lt.viko.eif.esemasko.soap.*;

import java.util.List;

/**
 * This class has one method: newMovie
 *
 * @version 1.0
 * @since 1.0
 */
public class MovieConstr {
    /**
     * This is a newMovie method
     * <p>
     * This method creates new movie object.
     *
     * @param movieList - list of movies object.
     * @return Movie                 - returns new movie object.
     */
    public static Movie newMovie(MovieList movieList) {
        Genre animation = new Genre();
        animation.setId((byte) 3);
        animation.setCategory("Animation");


        Director aaronHorvath = new Director();
        aaronHorvath.setId((byte) 4);
        aaronHorvath.setName("Aaron");
        aaronHorvath.setLastName("Horvath");

        Director michaelJelenic = new Director();
        michaelJelenic.setId((byte) 5);
        michaelJelenic.setName("Michael");
        michaelJelenic.setLastName("Jelenic");


        Writer matthewFogel = new Writer();
        matthewFogel.setId((byte) 4);
        matthewFogel.setName("Matthew");
        matthewFogel.setLastName("Fogel");


        Actor chrisPratt = new Actor();
        chrisPratt.setId((byte) 8);
        chrisPratt.setName("Chris");
        chrisPratt.setLastName("Pratt");
        chrisPratt.setAge((byte) 43);

        Actor anyaTaylorJoy = new Actor();
        anyaTaylorJoy.setId((byte) 9);
        anyaTaylorJoy.setName("Anya");
        anyaTaylorJoy.setLastName("Taylor-Joy");
        anyaTaylorJoy.setAge((byte) 27);

        Actor charlieDay = new Actor();
        charlieDay.setId((byte) 10);
        charlieDay.setName("Charlie");
        charlieDay.setLastName("Day");
        charlieDay.setAge((byte) 47);

        Actor jackBlack = new Actor();
        jackBlack.setId((byte) 11);
        jackBlack.setName("Jack");
        jackBlack.setLastName("Black");
        jackBlack.setAge((byte) 53);


        User tempUser = movieList.getMovies().get(0).getReviews().get(0).getUser();

        MovieReview review4 = new MovieReview();
        review4.setId((byte) 4);
        review4.setRating((byte) 8);
        review4.setCriticism("I enjoyed this movie.");
        review4.setUser(tempUser);


        Genre comedy = movieList.getMovies().get(0).getGenres().get(0);
        Genre adventure = movieList.getMovies().get(0).getGenres().get(2);


        Movie newMovie = new Movie();
        newMovie.setId((byte) 2);
        newMovie.setTitle("The Super Mario Bros. Movie");
        newMovie.setLength((short) 92);
        newMovie.getGenres().addAll(List.of(comedy, animation, adventure));
        newMovie.getDirectors().addAll(List.of(aaronHorvath, michaelJelenic));
        newMovie.getWriters().addAll(List.of(matthewFogel));
        newMovie.getCast().addAll(List.of(chrisPratt, anyaTaylorJoy, charlieDay, jackBlack));
        newMovie.getReviews().addAll(List.of(review4));

        return newMovie;
    }
}

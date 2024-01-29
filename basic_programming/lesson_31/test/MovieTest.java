import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import student_code.hash_table.Movie;

public class MovieTest {

    @Test
    public void testEqualityOfMovies(){
        Movie m1 = new Movie("movie", 100);
        Movie m2 = new Movie("movie", 100);
        Movie m3 = new Movie("movie", 101);
        Movie m4 = new Movie("movie4", 100);

        Assertions.assertFalse(m1.equals(null));

        //@Test
                //public void testHash



    }


}

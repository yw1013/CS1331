import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Movie> movies;

    public Cart() {
        movies = new ArrayList<>();
    }

    public void add(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public int totalPrice() {
        int total = 0;
        for (Movie movie: movies) {
            // : replace this switch statement with simple use of your new
            // polymorphic Movie classes.
            switch (movie.getGenre()) {
            case COMEDY:
                total += 3;
                break;
            case DRAMA:
                total += 4;
                break;
            default:
                total += 0;
                break;
            }
        }
        return total;
    }
}

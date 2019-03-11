package Functioninterface.ConsumerInterface;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MovieConsumer {

    public static void main(String[] args) {

        List<Movie> movies = populate();

        Consumer<Movie> c = m -> {
            System.out.println("Movie Name : " + m.getName());
            System.out.println("Hero Name : " + m.getHero());
            System.out.println("Herione Name : " + m.getHerione());
        };

        for (Movie m : movies
        ) {
            c.accept(m);
        }

        System.out.println("===use of Lambda====");
        movies.forEach(c);
    }

    static List<Movie> populate() {
        Movie m1 = new Movie("Lagaan", "Aamir", "Smitha");
        Movie m2 = new Movie("Bahubali", "Aamir", "Zeenat");
        Movie m3 = new Movie("Chaubali", "Nirav", "Konkana");
        Movie m4 = new Movie("Leta", "Pota", "Seemran");

        return Arrays.asList(m1, m2, m3, m4);
    }
}

@AllArgsConstructor
@Getter
class Movie {
    private String name;
    private String hero;
    private String herione;
}

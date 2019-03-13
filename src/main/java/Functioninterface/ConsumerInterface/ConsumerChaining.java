package Functioninterface.ConsumerInterface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.function.Consumer;

public class ConsumerChaining {

    public static void main(String[] args) {

        Movies movies = new Movies("Bahubali", true, true, true);

        Consumer<Movies> c1 = m -> {
            System.out.println(m.getName() + " is released : " + m.isReleased());
        };

        Consumer<Movies> c2 = m -> {
            System.out.println(m.getName() + " is a hit : " + m.isHit());
        };

        Consumer<Movies> c3 = m -> {
            System.out.println(m.getName() + " is stored in database : " + m.isStored());
        };

        Consumer<Movies> cout = c1.andThen(c2).andThen(c3);

        cout.accept(movies);
    }
}

@Getter
@Setter
@AllArgsConstructor
class Movies {
    private String name;
    private boolean isReleased;
    private boolean isHit;
    private boolean isStored;
}

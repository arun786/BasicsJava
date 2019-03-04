package LambdaFunction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateIsEqual {
    public static void main(String[] args) {

        Player player = new Player("sachin", "cricket");
        List<Player> players = new ArrayList<>();
        players.add(player);

        Emp emp = new Emp("sachin", "ceo");
        List<Emp> emps = new ArrayList<>();
        emps.add(emp);

        Predicate<Player> playerC = Predicate.isEqual(player);

        System.out.println(playerC.test(new Player("sachin", "golf")));

        BiPredicate<Player, Emp> t = (p, e) -> p.getName().equals(e.getName());
        System.out.println(t.test(player, emp));
    }
}

@Getter
@Setter
@AllArgsConstructor
class Player {
    private String name;
    private String game;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

@Getter
@Setter
@AllArgsConstructor
class Emp {
    private String name;
    private String designation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
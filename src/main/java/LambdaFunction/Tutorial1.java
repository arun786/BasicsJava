package LambdaFunction;

public class Tutorial1 {
    public static void main(String[] args) {

        print p = () -> System.out.println("This is first lambda functions");
        p.print();

        add a = (x, y) -> System.out.println(x + y);
        a.add(10, 20);

        length l = (x) -> x.length();
        int arun = l.getLength("arun");
        System.out.println(arun);

        square square = x-> x*x;
        int square1 = square.square(10);
        System.out.println(square1);

    }
}

@FunctionalInterface
interface print {
    void print();
}


@FunctionalInterface
interface add {
    void add(int a, int b);
}

@FunctionalInterface
interface length {
    int getLength(String s);
}

@FunctionalInterface
interface square {
    int square(int x);
}
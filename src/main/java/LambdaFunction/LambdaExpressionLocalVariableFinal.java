package LambdaFunction;

public class LambdaExpressionLocalVariableFinal {

    int number = 1;

    public static void main(String[] args) {

        //local variables accessed inside lambda expression should be final or effectively final


        LambdaExpressionLocalVariableFinal l = new LambdaExpressionLocalVariableFinal();
        l.m2();

    }

    void m2() {
        int localNumber = 10;

        Shape shape = () -> {
            System.out.println(number); //instance variable can be accessed from lambda expression o/p will be 1
            System.out.println(localNumber); //local variable can be accessed from lambda expression o/p will be 10

            //if you change the value of instance variable, you can change it
            number = 2;
            System.out.println(number);

            //localNumber = 20; this will give compile time error
        };

        shape.shape();
    }
}

interface Shape {
    void shape();
}
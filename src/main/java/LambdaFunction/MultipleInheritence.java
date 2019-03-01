package LambdaFunction;

public class MultipleInheritence implements Right, Left {

    public static void main(String[] args) {
        MultipleInheritence m = new MultipleInheritence();
        m.m1();
    }

    public void m1() {
        Left.super.m1(); //will output Left
    }
}

interface Right {
    default void m1() {
        System.out.println("Right");
    }
}

interface Left {
    default void m1() {
        System.out.println("Left");
    }
}

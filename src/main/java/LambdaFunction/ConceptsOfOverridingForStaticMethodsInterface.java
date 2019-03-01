package LambdaFunction;

public class ConceptsOfOverridingForStaticMethodsInterface {

    public static void main(String[] args) {
        Test.m1(); //you can have the same signature as static interface but it cannot be overridden
        Test1 test1 = new Test1();
        test1.m1();

        Test2.call();
    }
}


interface M1 {
    static void m1() {
        System.out.println("static method of an interface");
    }
}

class Test implements M1 {
    static void m1() {
        System.out.println("The static method cannot be overridden for an interface");
    }
}

class Test1 implements M1 {
    void m1() {
        System.out.println("Static method cannot be overridden, the same method can be written without static");
    }
}

class Test2 implements M1 {
    private static void m1() {
        System.out.println("This is valid");
    }

    public static void call() {
        m1();
    }

}
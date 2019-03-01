package LambdaFunction;

public class DefaultMethodInInterface implements DefaultMethod {

    public static void main(String[] args) {
        DefaultMethodInInterface defaultMethodInInterface = new DefaultMethodInInterface();
        defaultMethodInInterface.m1();
        defaultMethodInInterface.m2();
    }

    @Override
    public void m2() {
        System.out.println("Overriding the default method");
    }
}

interface DefaultMethod {
    default void m1() {
        System.out.println("Default method in interface");
    }

    default void m2() {
        System.out.println("Default method 2 in interface");
    }
}

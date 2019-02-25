package LambdaFunction;

public class AnonymousInnerClass {

    private String x = "Instance Variable which can be accessed from inner class using name of class . this";

    public void m2() {

        Inner inner = new Inner() {
            String x = "Instance variable of Inner class which can be accessed using this";

            @Override
            public void m1() {
                System.out.println(this.x);
                System.out.println(AnonymousInnerClass.this.x);
            }
        };

        inner.m1();

    }

    public static void main(String[] args) {
        AnonymousInnerClass a = new AnonymousInnerClass();
        a.m2();
    }


    //o/p
    //Instance variable of Inner class which can be accessed using this
    //Instance Variable which can be accessed from inner class using name of class . this
}


interface Inner {
    void m1();
}
package LambdaFunction;

public class AnonymousInnerClassReplcaedByLambda {

    private String x = "Instance variable which can be accessed from Lambda using this";

    void m2() {
        String x = "Variable inside m2 which cannot be accessed from Lambda using this";
        InnerLambda innerLambda = () -> {
            System.out.println(this.x);
            System.out.println(x);
        };

        innerLambda.m1();
    }

    public static void main(String[] args) {
        AnonymousInnerClassReplcaedByLambda a = new AnonymousInnerClassReplcaedByLambda();
        a.m2();
    }
}

interface InnerLambda {
    void m1();
}
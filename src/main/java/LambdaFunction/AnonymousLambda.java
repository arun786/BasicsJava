package LambdaFunction;

public class AnonymousLambda {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Client " + i);
            }
        };

        Thread t = new Thread(runnable);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + i);
        }
    }
}

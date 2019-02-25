package LambdaFunction;

public class AnonymousClass {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Client Code " + i);
                }
            }
        };

        Thread t = new Thread(runnable);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Code " + i);
        }
    }
}

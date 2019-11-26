package UsingThreadClass;

public class AppTest {
    public static void main(String[] args) {
        System.out.println("Starting running main...");

        App a1 = new App("Thread 1");
        a1.start();
        System.out.println("ABCD");

        App a2 = new App("Thread 2");
        a2.start();

        System.out.println("Ending running main...");
    }
}

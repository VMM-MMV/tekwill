public class Example2 {
    public static void main(String[] args) {
        Runnable runnable = () -> printHello();

        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    public static void printHello() {
        System.out.println("Hello World");
    }
}

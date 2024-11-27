import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadVSThreadExecutor {

    public static void main(String[] args) {
//        threadExecutor();
        thread();
    }

    private static void thread() {
        Thread thread1 = new Thread(() -> System.out.println("Printing zoo inventory"));
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Printing record: " + i);
            }
        });
        Thread thread3 = new Thread(() -> System.out.println("Printing zoo inventory"));

        System.out.println("begin");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for threads to finish before printing "end"
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }

    private static void threadExecutor() {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(() -> System.out.println("Printing zoo inventory"));
            service.execute(() -> {
                for (int i=0; i<3; i++) {
                    System.out.println("Printing record: " + i);
                }
            });
            service.execute(() -> System.out.println("Printing zoo inventory"));
            System.out.println("end");
        } finally {
            if(service != null) service.shutdown();
        }
    }
}

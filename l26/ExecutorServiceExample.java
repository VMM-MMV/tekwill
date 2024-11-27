import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(() -> {
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hello");});
        service.shutdown();
        System.out.println("bye");
    }

    private static void closeApp() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(() -> System.out.println("hello"));
        System.out.println("Hello");
        System.out.println("Goodbye");
    }
    
    private static void close() {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
        } finally {
            if(service != null) service.shutdown();
        }

        try (ExecutorService service2 = Executors.newSingleThreadExecutor()) {
        } catch (Exception ignore) {}

    }

    private static void autoCloseable() {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            service.submit(() -> System.out.println("Task executed by: " + Thread.currentThread().getName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

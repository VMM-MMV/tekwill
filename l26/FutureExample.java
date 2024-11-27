import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        var result = service.submit(() -> { Thread.sleep(10 * 1000); return 3; });
        System.out.println(1);
        System.out.println(result);
        System.out.println(2);
        service.shutdown();
    }

    public static void invokeAll() throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Create a list of tasks (Callable)
        List<Callable<String>> tasks = new ArrayList<>();
        tasks.add(() -> {
            Thread.sleep(1000);
            return "Task 1 completed";
        });
        tasks.add(() -> {
            Thread.sleep(2000);
            return "Task 2 completed";
        });
        tasks.add(() -> {
            Thread.sleep(1500);
            return "Task 3 completed";
        });

//        for (Callable<String> task : tasks) {
//            service.submit(task);
//        }

        // Use invokeAll to execute all tasks, but don't use get()
        List<Future<String>> results = service.invokeAll(tasks);

        for (Future<String> result : results) {
            System.out.println(result.get());  // get() blocks until the task is done
        }

        // Program does not wait for task completion since get() is not called
        System.out.println("Tasks are being executed...");

        // Shutdown the service
        service.shutdown();
    }

    private static void submit() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Submit tasks and get Future objects
        Future<?> future1 = service.submit(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Task 1 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Future<?> future2 = service.submit(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Task 2 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Future<?> future3 = service.submit(() -> {
            try {
                Thread.sleep(1500);
                System.out.println("Task 3 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Wait for all tasks to complete
        future1.get();  // blocks until task 1 is finished
        future2.get();  // blocks until task 2 is finished
        future3.get();  // blocks until task 3 is finished

        System.out.println("All tasks are completed.");

        // Shutdown the service
        service.shutdown();
    }

    private static void invokeAny() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = new ArrayList<>();
        tasks.add(() -> {
            Thread.sleep(1000);
            return "Task 1 completed";
        });
        tasks.add(() -> {
            Thread.sleep(500);
            throw new RuntimeException("Task 2 failed");
        });
        tasks.add(() -> {
            Thread.sleep(1500);
            return "Task 3 completed";
        });

        String result = service.invokeAny(tasks);
        System.out.println("First task completed with result: " + result);
    }
}

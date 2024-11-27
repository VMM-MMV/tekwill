import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CustomArrayList customArrayList = new CustomArrayList(10);
        new Thread(() -> customArrayList.add(1)).start();
        new Thread(() -> customArrayList.add(2)).start();
        Thread.sleep(2 * 1000);
        System.out.println(customArrayList);
    }
}

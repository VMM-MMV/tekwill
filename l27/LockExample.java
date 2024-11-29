import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    private final ReentrantLock lock = new ReentrantLock();
    private int sheepCount = 0;

    private void incrementAndReport() {
        lock.lock();
        try {
            int localSheepCount = sheepCount;

            try { Thread.sleep(10); } catch (InterruptedException e) { throw new RuntimeException(e); }
            sheepCount = localSheepCount + 1;
            System.out.print(sheepCount + " ");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            LockExample manager = new LockExample();
            for(int i=0; i<10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            if(service != null) service.shutdown();
        }
    }
}
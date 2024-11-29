import java.util.concurrent.*;

public class SynchronizedExample {
    private final Object monitor = new Object();
    private int sheepCount = 0;

//    private void incrementAndReport() {
//        synchronized (monitor) {
//            int localSheepCount = sheepCount;
//
//            try {Thread.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
//            sheepCount = localSheepCount + 1;
//            System.out.print(sheepCount + " ");
//        }
//    }

    private synchronized void incrementAndReport() {
        int localSheepCount = sheepCount;

        try {Thread.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
        sheepCount = localSheepCount + 1;
        System.out.print(sheepCount + " ");
    }

//    private static void hello() {
//        synchronized (SynchronizedExample.class) {
//            System.out.println("hello");
//        }
//    }

    private synchronized static void hello() {
        System.out.println("hello");
    }


    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SynchronizedExample manager = new SynchronizedExample();
            for(int i=0; i<10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            if(service != null) service.shutdown();
        }
    }
}
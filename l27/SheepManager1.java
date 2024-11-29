import java.util.concurrent.*;

public class SheepManager1 {
    private int sheepCount = 0;

    private void incrementAndReport() {
        int localSheepCount = sheepCount;

        try { Thread.sleep(10); } catch (InterruptedException e) { throw new RuntimeException(e); }
        sheepCount = localSheepCount + 1;
        System.out.print(sheepCount + " ");
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManager1 manager = new SheepManager1();
            for(int i=0; i<10; i++) {
//                manager.incrementAndReport();
                service.submit(() -> manager.incrementAndReport());
            }
        } finally {
            if(service != null) service.shutdown();
        }
    }
}
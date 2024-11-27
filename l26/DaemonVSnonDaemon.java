public class DaemonVSnonDaemon {
    public static void main(String[] args) {
        Thread nonDaemonThread = new Thread(() -> {
            System.out.println("Non-daemon thread running...");
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Non-daemon thread completed.");
        });

        // Creating a daemon thread
        Thread daemonThread = new Thread(() -> {
            System.out.println("Daemon thread running...");
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Daemon thread completed.");
        });

        // Set the daemon thread as a daemon
        daemonThread.setDaemon(true);

        // Start both threads
//        daemonThread.start();
        nonDaemonThread.start();
        throw new RuntimeException();

    }
}

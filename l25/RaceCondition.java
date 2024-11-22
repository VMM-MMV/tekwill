public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        int[] i = new int[1];
        i[0] = 10;
        Runnable runnable = () -> {
            i[0]++;
            System.out.println(1);
        };

        Runnable runnable2 = () -> {
            i[0]++;
            System.out.println(2);
        };

        new Thread(runnable).start();
        new Thread(runnable2).start();
        Thread.sleep(8);
        System.out.println(i[0]);
    }
}

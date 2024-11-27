public class CustomArrayList {
    private int[] array;
    private int index;

    public CustomArrayList(int size) {
        array = new int[size];
    }

    public void add(int val) { // 1  | 2
        array[index] = val;  // 0 -> 1 | 0 -> 2
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        index++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < index; i++) {
            sb.append(array[i]);
            if (i < index - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

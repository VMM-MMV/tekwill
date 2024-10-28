public class CustomSet implements CustomSetInterface {

    private boolean[] array;
    private int size;

    public CustomSet(int size) {
        this.size = size;
        this.array = new boolean[size];
    }

    @Override
    public int hash(String item) {
        return Object.hash(item);
    }

    public void add(String item) {
        int arrayPosition = this.hash(item);
        if (array[arrayPosition] == true) {
            return;
        }
        array[arrayPosition] = true;
    }
}

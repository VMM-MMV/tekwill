public class CustomIntArrayList extends CustomList {
    private int size;
    private int[] array;

    // ["viem2377@gmail.com", "vlad_p@ ]

    public CustomIntArrayList(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public void add(int item) {
        if (array.length+1 > size) {
            int[] temp = new int[size * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            array = temp;
            size = size * 2;
        }
        array[array.length+1] = item;
    }

    public void remove() {
        System.out.println("not implemented");
    }
}
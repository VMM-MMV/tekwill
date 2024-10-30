public class CustomArrayList<E> {
    private int arrSize;
    private E[] array;

    public CustomArrayList(int initialSize) {
        this.arrSize = 0;
        this.array = (E[]) new Object[initialSize];
    }

    public void add(E item) {
        if (this.arrSize == this.array.length) {
            E[] temp = (E[]) new Object[this.array.length * 2];
            System.arraycopy(this.array, 0, temp, 0, this.array.length);
            this.array = temp;
        }
        
        this.array[this.arrSize++] = item;
        printArray();
    }

    public void remove() {
        if (arrSize > 0) {
            this.array[--this.arrSize] = null; // Set last element to null
        }
    }

    private void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.arrSize; i++) {
            System.out.print(this.array[i] + " ");
        }
        System.out.print("]\n");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.arrSize; i++) {
            sb.append(array[i]);
            if (i < this.arrSize - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

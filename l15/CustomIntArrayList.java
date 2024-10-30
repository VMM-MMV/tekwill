public class CustomIntArrayList {
    private int arrSize;
    private int[] array;

    public CustomIntArrayList(int arrSize) {
        this.arrSize = 0;
        this.array = new int[arrSize];
    }

    public void add(int item) {
        if (this.arrSize+1 == this.array.length) {
            int[] temp = new int[this.arrSize * 2];
            for (int i = 0; i < this.array.length; i++) {
                temp[i] = this.array[i];
            }
            this.array = temp;
        }
        
        this.array[this.arrSize++] = item;
        printArray(this.array);
    }

    public void remove() {
        this.array[this.arrSize--] = 0;
    }

    private void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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
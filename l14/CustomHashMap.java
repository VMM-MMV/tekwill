public class CustomHashMap {

        private boolean[] array;
        private int size;
    
        public CustomHashMap(int size) {
            this.size = size;
            this.array = new boolean[size];
        }
    
        public int hash(String item) {
            return Object.hash(item);
        }
    
        public void add(String key, String value) {
            int arrayPosition = this.hash(key);
            if (array[arrayPosition] == true) {
                return;
            }
            array[arrayPosition] = value;
        }
    }
    
}

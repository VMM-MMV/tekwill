import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String absolutePath = "C:\\Users\\miguel top\\Desktop\\l28\\out\\production\\l28\\hello/test.txt";

        File file = new File("hello/test.txt");
//        File file = new File("hello/test.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        System.out.println(file.getParent());
        System.out.println(Arrays.toString(new File("hello").listFiles()));
        System.out.println(file.lastModified());

//        System.out.println(System.getProperty("file.separator"));
//
//        System.out.println(java.io.File.separator);
    }
}

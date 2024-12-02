import java.io.*;

public class CopyFileSample {
    public static void copy(File source, File destination) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {
//             010
//             1010101010010101
            int b;
            while((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }

    public static void bufferedCopy(File source, File destination) throws IOException {
        try (
                InputStream in = new BufferedInputStream(new FileInputStream(source), 4096);
                OutputStream out = new BufferedOutputStream(
                        new FileOutputStream(destination))) {
            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer,0,lengthRead);
                out.flush();
            }
        }
    }

    public static void read(File source) throws IOException {
        try (InputStream in = new FileInputStream(source)) {
            int temp;
            while ((temp = in.read()) != -1) {
                System.out.println((char) temp);
            }
        }
    }
    public static void main(String[] args) throws IOException {
//        File source = new File("Zoo.class");
//        File destination = new File("ZooCopy.class");
//        copy(source,destination);

        File source = new File("hello/test.txt");
        read(source);
    }
}


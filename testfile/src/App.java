import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        FileReader fw = new FileReader("C:/java/testRepository/testfile/src/sample.txt");
        int i = fw.read();

        while (i != -1) {
            char c = (char) i;
            System.out.println(c);
            i = fw.read();
        }
        System.out.println("おわり");
        fw.close();
    }
}

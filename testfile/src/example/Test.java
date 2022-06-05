package example;

import java.io.FileReader;

public class Test {

	public void ts() {
		try {
			FileReader fw = new FileReader("C:/java/testRepository/testfile/src/sample.txt");

			int i = fw.read();

			while (i != -1) {
				char c = (char) i;
				System.out.print(c);
				i = fw.read();
			}
			System.out.println("おわり");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

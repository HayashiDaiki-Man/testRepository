package example;

import java.io.FileOutputStream;

public class BinaryFile {
	public void bfMethod() {
		try {
			FileOutputStream fo = new FileOutputStream("C:/java/testRepository/testfile/src/images/earth.jfif", true);
			fo.write(255);
			fo.flush();
			fo.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

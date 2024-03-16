import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("FileOutputStreamTest.txt", true);
		fos.write(65); // 65 -> 01000001 in binary ('A')
		fos.flush();
		fos.close();
	}
	/*
	 * The file has 'A'
	 * ryuto@ryutomac IO % xxd -b FileOutputStreamTest.txt
	 * 00000000: 01000001  
	 */
}

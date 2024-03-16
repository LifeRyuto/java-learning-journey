import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("FileWriterTest1.txt");
		fw.write('A');
		fw.write('B');
		fw.flush();
		fw.close();
		//AB

		FileWriter fw2 = new FileWriter("FileWriterTest2.txt", true);
		fw2.write('A');
		fw2.write('B');
		fw2.flush();
		fw2.close();
		//AB
		
		FileWriter fw3 = new FileWriter("FileWriterTest1.txt");
		fw3.write('A');
		fw3.write('B');
		fw3.flush();
		fw3.close();
		//AB because the file was overwritten
		
		FileWriter fw4 = new FileWriter("FileWriterTest2.txt", true);
		fw4.write('A');
		fw4.write('B');
		fw4.flush();
		fw4.close();
		//ABAB because the file was appended
	}

}

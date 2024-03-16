import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		for(int i = 0; i < 2; i++) {
			write();
		    read("FileReaderTest1.txt");
		    read("FileReaderTest2.txt");
		}
	}
	
	public static void read(String fileName) throws IOException{
	    FileReader fw = new FileReader(fileName);
	    int i = fw.read();
	    while (i != -1) {
	      char c = (char)i;
	      System.out.print(c);
	      i = fw.read();
	    }
	    System.out.println();
	    fw.close();
	}
	
	public static void write() throws IOException{
		FileWriter fw1 = new FileWriter("FileReaderTest1.txt");
		fw1.write('A');
		fw1.write('B');
		fw1.flush();
		fw1.close();

		FileWriter fw2 = new FileWriter("FileReaderTest2.txt", true);
		fw2.write('A');
		fw2.write('B');
		fw2.flush();
		fw2.close();
	}

}

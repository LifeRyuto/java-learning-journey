import java.io.FileWriter;
import java.io.IOException;

//try-with-resources
public class FileWriterExceptionHandling2 {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("FileWriterExceptionHandling2.txt", true);) {
			fw.write('A');
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

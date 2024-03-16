import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExceptionHandling1 {

	public static void main(String[] args) {
	    FileWriter fw = null;
	    try {
	      fw = new FileWriter("FileWriterExceptionHandling1", true);
	      fw.write('A');
	      fw.flush();
	    } catch (IOException e) {
	      e.printStackTrace();
	    } finally {
	      if (fw != null) {
	        try {
	          fw.close(); //Close the file in finally block
	        } catch (IOException e2) { }
	      }
	    }
	}

}

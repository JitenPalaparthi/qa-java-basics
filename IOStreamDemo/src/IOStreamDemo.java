import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IOStreamDemo {
	public static void main(String[] args) {
		try {
		InputAndOutput.copy("C:\\Users\\jiten\\workspace\\cat.png","C:\\Users\\jiten\\workspace\\katty.png");	
		InputAndOutput.bufferCopy("C:\\Users\\jiten\\workspace\\somefile.txt","C:\\Users\\jiten\\workspace\\destfile.txt");
		}catch(Exception e) {
			System.out.println(e.getMessage());
	}
	

}

class InputAndOutput {

	public static void copy(String inFile, String outFile) throws IOException {
		try (FileInputStream fileInputStream = new FileInputStream(inFile);
				FileOutputStream fileOutputStream = new FileOutputStream(outFile);) {
			int numberOfBytesRead;
			byte[] bytesArray = new byte[128];
			while ((numberOfBytesRead = fileInputStream.read(bytesArray)) != -1) {
				fileOutputStream.write(bytesArray, 0, numberOfBytesRead);
			}
		}
	}
	
	public static void bufferCopy(String inFile, String outFile) {
		 try(
		            BufferedReader br = new BufferedReader(new FileReader(inFile));
		            BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))
		        ) {
		            String line;
		            while((line = br.readLine()) != null) {
		                bw.write(line + "\n");
		            }
		        } catch (IOException e) {
		            System.out.println("IOException: " + e.getMessage());
		        }
		    }
	}
}

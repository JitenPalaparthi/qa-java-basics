import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Inference {
	public static void main(String[] args) {
		try {
			var i =10;
			var f = 100.10f;
			System.out.println("Variable i:"+i);
		InputAndOutput.copy("C:\\Users\\jiten\\workspace\\cat.png","C:\\Users\\jiten\\workspace\\katty.png");	
		InputAndOutput.bufferCopy("C:\\Users\\jiten\\workspace\\somefile.txt","C:\\Users\\jiten\\workspace\\destfile.txt");
		}catch(Exception e) {
			System.out.println(e.getMessage());
	}
	

}

class InputAndOutput {

	public static void copy(String inFile, String outFile) throws IOException {
		try (var fileInputStream = new FileInputStream(inFile);
				FileOutputStream fileOutputStream = new FileOutputStream(outFile);) {
			var numberOfBytesRead=0;
			var bytesArray = new byte[128];
			while ((numberOfBytesRead = fileInputStream.read(bytesArray)) != -1) {
				fileOutputStream.write(bytesArray, 0, numberOfBytesRead);
			}
		}
	}
	
	public static void bufferCopy(String inFile, String outFile) {
		 try(
		            var br = new BufferedReader(new FileReader(inFile));
		            var bw = new BufferedWriter(new FileWriter(outFile))
		        ) {
		            var line="";
		            while((line = br.readLine()) != null) {
		                bw.write(line + "\n");
		            }
		        } catch (IOException e) {
		            System.out.println("IOException: " + e.getMessage());
		        }
		    }
	}
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileException fe1 = new FileException();

			String line = fe1.readFirstLine2("C:\\Users\\jiten\\demo.txt1");
			System.out.println(line);
		} catch (IOException exp) {
			System.out.println("Alert-->"+ exp.getMessage());
		}
	}
}

class FileException {

	public String readFirstLine1(String path) throws IOException  {
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			return br.readLine();
		} catch (IOException e) {
			//throw e;
			System.out.println("IOException, message is: " + e.getMessage());
		}
		return "";
	}
	
	 public String readFirstLine2(String path) throws IOException {
	        try(BufferedReader br = new BufferedReader(new FileReader(path))
	        ) {
	            return br.readLine();
	        }
	    }
}
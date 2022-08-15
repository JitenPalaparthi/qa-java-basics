import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {
			int[] arr = new int[5];
			arr[0] = 100;
			arr[1] = 200;
			arr[2] = 300;
			arr[3] = 400;
			arr[4] = 500;
			// the length of array is 5
			// 0-4
			// System.out.println(1 / 0);
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException exp) {
			System.out.println("Exception has raised-->" + exp.getMessage());
		} catch (ArithmeticException exp) {
			System.out.println("Exception has raised -->" + exp.getMessage());
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
		} finally {
			System.out.println("Hello World! I am finally block, I will be executed if or not there is an exception");
		}
	}
}





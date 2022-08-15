import java.util.ArrayList;

@FunctionalInterface
interface Void {
	public void VoidFunc();
}

@FunctionalInterface
interface EvenChecker {
	public boolean isEven(int num);
}

public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// (params) -> expression

		// Creating and calling LamadaExpression function
		String msg = "Hello World!";

		Void v1 = () -> {
			System.out.println("Do nothing " + msg);
		};
		v1.VoidFunc();

		// Calling normal interface
		Void v2 = new Demo();
		v2.VoidFunc();

		//

		EvenChecker ec1 = (n) -> {
			if (n % 2 == 0) {
				return true;
			}
			return false;
		};

		System.out.println("IsEven:" + ec1.isEven(101));
		System.out.println("IsEven:" + ec1.isEven(110));

		ArrayList list = new ArrayList();
		list.add("Jiten");
		list.add("Alena");
		list.add("Ahemad");
		list.add("David");
		list.add("Pooja");
		list.add("Mandeep");
		list.add("Elliot");
		list.add("Bogart");

		list.forEach(s -> {
			System.out.println("Hello " + s + "!");
		});
	}
}

class Demo implements Void {
	@Override
	public void VoidFunc() {
		System.out.println("Do nothing");
	}
}



// Two FunctionInterfaces
// 1- float AreaOfRect(float L, float B)
// 2- float AreaOfSquare(float s);
// 3- float AreaOfCube(float a,float b,float c);
// 4- call area of rect using a lamda expression
// 5- call area of square using lamda expression
// 6- call area of cube using lama expression



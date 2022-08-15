
public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc c1 = new Calc();
		
		System.out.println("Addion of two int params:"+c1.Add(10, 20));
		System.out.println("Addion of three int params:"+c1.Add(10, 20,30));
		System.out.println("Addion of two float params:"+c1.Add((float)10.50, (float)20.25));
		System.out.println("Addion of three float params:"+c1.Add((float)10.50, (float)20.25,(float)30.75));

	}

}

class Calc {

	// Polymorphism Method Overloading

	public int Add(int a, int b) {
		return a + b;
	}

	public int Add(int a, int b, int c) {
		return a + b + c;
	}
	
	public float Add(float a, float b) {
		return a+b;
	}
	
	public float Add(float a, float b,float c) {
		return a+b+c;
	}
}

// Create a class called Shape --> It must contain three Area methods
// all are float parameters and returns floats
// 1- Area(l,b)
// 2- Area(l,b,h)
// 3- Area(s)
// 4- Perimeter(l,b)
// 5- Perimeter(l,b,h)
// 6- Perimeter(s)


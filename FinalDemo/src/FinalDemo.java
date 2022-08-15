
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Shape s = new Shape(); // cannot create an object for an abstract class
		
		Circle c1 = new Circle(15.67f);
		// c1.PI=3.143f; this is a compile error because PI is final cannot be mutated.
		System.out.println("Area of Circle:"+c1.Area());

	}

}

abstract class Shape {

	abstract float Area();

	abstract float Perimeter();

}

class Rect extends Shape {

	float Length, Width;

	@Override
	public float Area() {
		return this.Length * this.Width;
	}

	@Override
	public float Perimeter() {
		return 2 * (this.Length + this.Width);
	}

}

final class Circle { // If a class is final , cannot use this class as a base class

	float Radius;

	final float PI = 3.14f; // final it cannot be changed.
	
	public Circle(float r) {
		this.Radius=r;
	}

	final public float Area() {
		return PI * this.Radius * this.Radius;
	}
}

//class Oval extends Circle{
//	
//	@Override
//	public float Area() {
//		return this.Radius*this.Radius;
//	}
//	
//}

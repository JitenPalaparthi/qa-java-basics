
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Shape s1 = new Shape();
		
		Shape s1 = new Rectangle((float)100.25,(float)110.45);
		float a1=s1.Area();
		float p1 = s1.Perimeter();
		System.out.println("Area of Rectangle:"+a1);
		System.out.println("Perimeter of Rectangle:"+p1);
		s1.Display();
		
		s1 = new Cuboid((float)100.25,(float)110.45,(float)90.45);
		float a2=s1.Area();
		float p2 = s1.Perimeter();
		System.out.println("Area of Cuboid:"+a2);
		System.out.println("Perimeter of Cuboid:"+p2);
		s1.Display();
		
	}

}
// cannot create an instance for an abstract class
abstract class Shape{
	protected abstract float Area(); // Derived class(s) must implement these methods.
	protected abstract float Perimeter();// Derived class(s) must implement these methods.
	
	public void Display() {
		System.out.println("This is a Shape abstract class.Called from some derived class");
		// This is wrong design because base class should never depend on derived class
//		if (this instanceof Rectangle){
//			System.out.println("This is a Rectangle Shape class");
//		}
	}
}
class Rectangle extends Shape{
	float Length;
	float Width;
	
	public Rectangle(float l, float w) {
		this.Length=l;
		this.Width=w;
	}
	
	@Override
	public float Area() {
		return this.Length * this.Width;
	}
	
	@Override
	public float Perimeter() {
		return 2*(this.Length + this.Width);
	}
}

class Cuboid extends Shape{
	float Length;
	float Width;
	float Height;
	
	public Cuboid(float l, float w,float h) {
		this.Length=l;
		this.Width=w;
		this.Height=h;
	}
	
	@Override
	public float Area() {
		return this.Length * this.Width * this.Height;
	}
	
	@Override
	public float Perimeter() {
		return 4*(this.Length + this.Width+this.Height);
	}
}

// 1- Create Animal abstract class..
// 2- write eat,run,talk,sleep like abstract methods.
// 3- extend it by Rabbit, Dog and Tiger
// 4- Add additional methods for Rabbit, Dog and Tiger based on them.
// 5- but all the methods mentioned in step 2 must be implemented.
// 6- Declare Animal object and call all the methods based on the Derived Animal( mentioned in step 3)
//    Animal a1 = new Dog(); a1= new Cat();

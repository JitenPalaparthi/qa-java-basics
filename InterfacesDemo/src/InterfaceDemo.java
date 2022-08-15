
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d1= new Dog();
		
		Animal a1 = d1;
		
		a1.eat();
		a1.sleep();
		a1.talk();
		a1.run();
		Jump j1 = d1;
		j1.jump();
		
		// IShape Implementation
		
		IShape s1 = new Rect((float)120.45,(float)130.56);
		System.out.println("Area of Rect="+s1.Area());
		System.out.println("Perimeter of Rect="+s1.Perimeter());
	}
}

interface Animal{
	void run();
	void talk();
	void eat();
	void sleep();
	}

interface Jump{
	void jump();
}

class Dog implements Animal,Jump{
	
	public void run() {
		System.out.println("Dog is running");
		}
	public void talk() {
		System.out.println("Dog is barking");
	}
	public void eat() {
		System.out.println("Dog is eating");
	}
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
	public void jump() {
		System.out.println("Dog is jumping");
	}
	
}


interface IShape{
	float Area();
	float Perimeter();
}

class Rect implements IShape{
	float L,W;
	public Rect() {
		
	}
	public Rect(float l, float w) {
		this.L=l;
		this.W=w;
	}
	
	public float Area() {
		return this.L*this.W;
	}
	
	public float Perimeter() {
		return 2*(this.L+this.W);
	}
}

// Task
// Create an ArrayList
// of the following type AraayList<IShape>
// Create Rectangle, Cube, Square, Triangle class
// All these classes must implement Area and Perimeter through IShape interface
// Add these instances into the ArrayList
// list1.add(new Rect(12.4,14.56));
// list1.add(new Square
// list1.add(new Cube
// list1.add(new Triangle
// write a for loop
// for (Ishape s:list1){

//println("Area="+s.Area());
//println("Perimeter="+s.Perimeter)

//}




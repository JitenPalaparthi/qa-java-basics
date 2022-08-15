
public class ConstructorDemo {

	public static void main(String[] args) {

		// default constructor
		Rect r1 = new Rect();
		float area1 = r1.Area();
		float perimeter1 = r1.Perimeter();
		
		System.out.println("Default Constructor");
		System.out.println("r1-Area=" + area1);
		System.out.println("r1-Perimeter=" + perimeter1);
		System.out.println();

		// params constructor
		Rect r2 = new Rect((float) 100.34, (float) 110.54);
		float area2 = r2.Area();
		float perimeter2 = r2.Perimeter();

		System.out.println("Parameterised Constructor");
		System.out.println("r2-Area=" + area2);
		System.out.println("r2-Perimeter=" + perimeter2);
		System.out.println();
		
		// copy constructor
		Rect r3 = new Rect(r2);
		float area3 = r3.Area();
		float perimeter3 = r3.Perimeter();

		System.out.println("Copy Constructor");
		System.out.println("r3-Area=" + area3);
		System.out.println("r3-Perimeter=" + perimeter3);
		System.out.println();

	}

}

// The name of the constructor is the same of the class
// Constructor does not return any thing. So cannot write public int Rect() //Wrong
// Can create multiple constructors but parameters must be different/ Singnature must be different
 class Rect {

	private float length;
	private float width;
	private float area;
	private float perimeter;

	// default constructor
	public Rect() {
		this.length = 1;
		this.width = 1;
		System.out.println("Instantiated Object of type Rect");
	}

	public Rect(float l, float w) {
		this.length = l;
		this.width = w;
	}

//	public Rect(float l, float w,float a) {
//		this.length = l;
//		this.width = w;
//		this.area =a;
//	}
//	
//	public Rect(float l, float w,float a,float p) {
//		this.length = l;
//		this.width = w;
//		this.area =a;
//		this.perimeter=p;
//	}
	
	public Rect(Rect r) {
		this.length = r.length;
		this.width = r.width;
	}

	public float Area() {
		this.area= this.length * this.width;
		return this.area;
	}

	public float Perimeter() {
		this.perimeter = 2 * (this.length + this.width);
		return this.perimeter;
	}
}

// task
// create a class called cube
// create three variations of constructors
// give Area and Perimenter of Cube

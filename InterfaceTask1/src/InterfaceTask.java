
import java.util.ArrayList;


public class InterfaceTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<IShape> list = new ArrayList<IShape>();
		list.add(new Rect((float) 12.45, (float) 15.67));
		list.add(new Rect((float) 112.45, (float) 115.67));
		list.add(new Square((float) 12.45));
		list.add(new Square((float) 25.25));
		list.add(new Cuboid((float) 12.45, (float) 15.67, (float) 17.47));
		list.add(new Cuboid((float) 122.45, (float) 115.67, (float) 117.47));
		list.add(new Triangle((float) 12.45, (float) 15.67));

		for (IShape s : list) {
			if (s instanceof Rect) {
				System.out.println("Rectangle Area and Perimeter");
			} else if (s instanceof Square) {
				System.out.println("Square Area and Perimeter");
			} else if (s instanceof Cuboid) {
				System.out.println("Cuboid Area and Perimeter");
			} else if (s instanceof Triangle) {
				System.out.println("Triangle Area and Perimeter");
			}else {
				System.out.println("Wrong shape");
			}
			System.out.println("Area:" + s.Area());
			System.out.println("Perimeter" + s.Perimeter());
			System.out.println();
		}

	}

}

interface IShape {
	float Area();

	float Perimeter();
}

class Square implements IShape {
	float Side;

	public Square() {

	}

	public Square(float s) {
		this.Side = s;
	}

	public float Area() {
		return this.Side * this.Side;
	}

	public float Perimeter() {
		return 4 * this.Side;
	}
}

class Rect implements IShape {
	float Length;
	float Width;

	public Rect() {

	}

	public Rect(float l, float w) {
		this.Length = l;
		this.Width = w;
	}

	public float Area() {
		return this.Length * this.Width;
	}

	public float Perimeter() {
		return 2 * (this.Length + this.Width);
	}
}

class Cuboid implements IShape {
	float Length;
	float Width;
	float Height;

	public Cuboid(float l, float w, float h) {
		this.Length = l;
		this.Width = w;
		this.Height = h;
	}

	public float Area() {
		return this.Length * this.Width * this.Height;
	}

	public float Perimeter() {
		return 4 * (this.Length + this.Width + this.Height);
	}
}

class Triangle implements IShape {
	float Base;
	float Height;

	public Triangle(float b, float h) {
		this.Base = b;
		this.Height = h;
	}

	public float Area() {
		return (float) 0.5 * this.Base * this.Height;
	}

	// Not sure abt perimeter implementation of a triangle.Todo yet to check
	public float Perimeter() {
		return 2 * this.Base + this.Height;
	}
}


public class InterfaceSegregationDemo {

	public static void main(String[] args) {

		// IShape is1= new Rectangle(10.45f,12.34f);
		var is1 = new Rectangle(10.45f, 12.34f);
		// IShape is2= new Square(25.25f);
		var is2 = new Square(25.25f);

		System.out.println("Rectangle Area:" + calculateArea(is1));
		System.out.println("Rectangle Perimeter:" + calculatePerimeter(is1));

		System.out.println("Square Area:" + calculateArea(is1));
		System.out.println("Square Perimeter:" + calculatePerimeter(is1));

	}

	public static float calculateArea(IArea iarea) {
		return iarea.area();
	}

	public static float calculatePerimeter(IPerimeter iperimeter) {
		return iperimeter.perimeter();
	}

}

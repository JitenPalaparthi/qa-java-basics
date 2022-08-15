
public class OpenClosedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Area of Rectangle:"+areaCalculate(new Rectangle(10.10f,12.12f)));
		System.out.println("Area of Square:"+areaCalculate(new Square(10.10f)));
		System.out.println("Area of Cuboid:"+areaCalculate(new Cuboid(10.10f,12.12f,11.11f)));


	}
	
	public static float areaCalculate(Shape shape) {
		return shape.calculateArea();
	}

}

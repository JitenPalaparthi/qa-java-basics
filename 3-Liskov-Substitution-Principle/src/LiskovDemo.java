
public class LiskovDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	var r1=new Rectangle(10.10f,12.12f);
		System.out.println("Area of Rectangle:"+areaCalculate(r1));
		var s1= new Square(10.10f);
		System.out.println("Area of Square:"+areaCalculate(s1));
		var c1= new Cuboid(10.10f,12.12f,11.11f);
		System.out.println("Area of Cuboid:"+areaCalculate(c1));
	}
	
	public static float areaCalculate(Shape shape) {
		return shape.calculateArea();
	}
}

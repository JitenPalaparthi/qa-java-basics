
public class Square implements IArea,IPerimeter,IShape{
	private float side;

	public Square(float side) {
		this.side = side;
	}
	
	public float area() {
		return this.side*this.side;
	}
	
	public float perimeter() {
		return 4*this.side;
	}

	
}


public class Rectangle implements IArea,IPerimeter,IShape{
	private float length,width;

	public Rectangle(float length,float width) {
		this.length=length;
		this.width=width;
	}
	
	public float area() {
		return this.length*this.width;
	}
	
	public float perimeter() {
		return 2*(this.width+this.length);
	}

	
}

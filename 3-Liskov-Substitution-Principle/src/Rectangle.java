
public class Rectangle extends Shape {
	
	private float length;
	private float width;
	
	public Rectangle(float l, float w) {
		this.length=l;
				this.width=w;
	}
	
	@Override
	public float calculateArea() {
		return this.length*this.width;
	}

}

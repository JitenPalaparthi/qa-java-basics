
public class Rectangle implements Shape {
	
	private float length;
	private float width;
	
	public Rectangle(float l, float w) {
		this.length=l;
				this.width=w;
	}
	
	public float calculateArea() {
		return this.length*this.width;
	}
	public void showArea() {}


}

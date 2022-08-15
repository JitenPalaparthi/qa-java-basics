
public class Square implements Shape{

	float side;
	
	public Square(float s) {
		this.side=s;
	}
	
	public float calculateArea() {
		return this.side*this.side;
	}
	
	public void showArea() {}

}

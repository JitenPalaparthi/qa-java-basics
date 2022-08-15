
public class Square extends Shape{

	float side;
	
	public Square(float s) {
		this.side=s;
	}
	
	@Override
	public float calculateArea() {
		return this.side*this.side;
	}

}

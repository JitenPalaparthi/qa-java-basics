/**
 * @author
 * Jiten
 */
package shape;

public class Square extends Shape{

	float Side;
	
	public Square() {}
	public Square(float s) {
		this.Side=s;
	}
	
	 /**
     * Area to be called to fetch the area of Square.
     * The area is based on Side attribute in Square class
     * @return
     * It returns Area of Square in float
     */
	@Override
	public float area() {
		return this.Side*this.Side;
	}
	
	/**
     * perimeter to be called to fetch the perimeter of Square.
     * The perimeter is based on Side attribute in Square class
     * @return
     * It returns perimeter of Square in float
     */
	@Override
	public float perimeter() {
		return 4 * this.Side;
	}
	
}

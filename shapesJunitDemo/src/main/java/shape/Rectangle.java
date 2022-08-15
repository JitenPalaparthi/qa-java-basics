/**
 * @author
 * Jiten
 */
package shape;

public class Rectangle extends Shape{
    float Length,Width;
    
    public Rectangle() {
    	
    }
    public Rectangle(float l, float w) {
    	this.Length=l;
    	this.Width=w;
    }
    /**
     * Area to be called to fetch the area of rectangle.
     * The area is based on Length and Width attributes in Reactangle class
     * @return
     * It returns Area of Rectangle in float
     */
	@Override
	public float area() {
		return this.Length * this.Width;
	}
	
	/**
     * perimeter to be called to fetch the perimeter of rectangle.
     * The perimeter is based on Length and Width attributes in Reactangle class
     * @return
     * It returns perimeter of Rectangle in float
     */
	@Override
	public float perimeter() {
		return 2 *(this.Length+this.Width);
	}
}

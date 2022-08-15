/**
 * @author
 * Jiten
 */
package shape;

public abstract class Shape {

	  /**
     * Area to be called to fetch the area of a derived shape.
     * The area is based on attributes in derived shape class
     * @return
     * It returns Area of derived shape in float
     * @throws
     * at present this method does not throw any exception.
     */
	protected abstract float area();

	/**
     * perimeter to be called to fetch the perimeter of a derived shape.
     * The perimeter is based on  attributes in derived shape class
     * @return
     * It returns perimeter of derived shape in float
     * @throws
     * at present this method does not throw any exception.
     */
	protected abstract float perimeter();

}

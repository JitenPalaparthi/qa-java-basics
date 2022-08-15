
public class Cuboid extends Shape {

	private float length;
	private float width;
	private float height;

	public Cuboid(float l, float w, float h) {
		this.length = l;
		this.width = w;
		this.height = h;
	}

	@Override
	public float calculateArea() {
		return this.length * this.width * this.height;
	}

}

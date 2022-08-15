
public class Car {

	private String model;
	private String make;
	private float mileage;

	public Car() {
		
	}
	public Car(String make,String model,float mileage){
		this.make=make;
		this.model=model;
		this.mileage=mileage;
	}
	
	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public float getMileage() {
		return this.mileage;
	}

	public void setMileage(float mileage) {
		this.mileage = mileage;
	}

//	public void Drive(String name){
//		System.out.println("Driver:"+name+" is driving Car of Make:"+this.getMake()+  " and Model:"+this.getModel());
//	}
	
}

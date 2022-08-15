
public class Driver {

	String name;
	String license;
	
	public Driver() {}
	
	public Driver(String name,String license) {
		this.name=name;
		this.license=license;
	}
	
	public void Drive(Car c) {
		System.out.println("Driver:"+this.name+" is driving Car of Make:"+c.getMake()+  " and Model:"+c.getModel());
	}
}

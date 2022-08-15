
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	BaseChassis bc1 = new BaseChassis("VW12345","MT","Petrol",1000,10);
		bc1.start();
		bc1.applyBreak();
		bc1.stop();*/
	
		OilTanker ot1 = new OilTanker("VW12345","MT","Petrol",1000,10,10000,(float)900.50,"There are three walves, Oil leak protection");
		ot1.start(); // Method of base class
		ot1.applyBreak(); // Method of base class
		ot1.fillOil(); // Method of OilTanker , derived class
		ot1.stop(); // Method of base class
	
	}
}

// 1- There is a root class for each and every class. That is java.lang.Object.
// 2 -It is automatically inherited class.We don't explicitly extends it.
// 3 -class BaseChassis extends java.lang.Object{   // This is not required base of statement -2.

class BaseChassis{
	    // attributes
		// properties
		// fields
		// members means both attributes and methods
		
	protected String chassisNo; //  Apart from its own class only the derived class can call this attribute
	private String fuelType;    // Diesel, Petrol , CNG
	private String transmissionType; // MT,AT
	private int fuelCapacity; // 1000Lts , 500Lts
	private int numbeOfWheels; // 6, 10, 16
	private int currentFuelReading;
	private boolean isStarted;
	
	public BaseChassis() {
		
	}
	
	public BaseChassis(String chassisno,String transType, String fuelType,int fuelCapacity,int noOfWheels) {
		this.chassisNo=chassisno;
		this.fuelType= fuelType;
		this.fuelCapacity= fuelCapacity;
		this.transmissionType=transType;
		this.numbeOfWheels= noOfWheels;
	}
	
	// There is no setter for chassis number so it cannot be changed.
	public String getChassisNo() {
		return this.chassisNo;
	}
	
	public String getFuelType() {
		return this.fuelType;
	}
	
	public String getTransmissionType() {
		return this.transmissionType;
	}
	
	public int getFuelCapacity() {
		return this.fuelCapacity;
	}
	
	public void setFuelCapacity(int noOfLiters) {
		this.fuelCapacity= noOfLiters;
	}
	
	public int getNumbeOfWheels() {
		return this.numbeOfWheels;
	}
	
	public int getCurrentFuelReading() {
		return this.currentFuelReading;
	}
	
	public void setCurrentFuelReading(int fuelInLiters) {
		this.currentFuelReading = fuelInLiters;
	}
	
	public boolean getIsStarted() {
		return this.isStarted;
	}
	
	public void setIsStarted(boolean hasStarted) {
		// if the vehicle is already started , give a message that vehicle is already started.
		this.isStarted=hasStarted;
	}
	
	// methods
	//If multiple times Start method is called it should say that the vehicle is already started.
	public void start() {
		this.isStarted= true;
		System.out.println("Vehicle started.Its Chassis number is "+ this.chassisNo);
	}
	
	//If multiple times stop method is called it should say that the vehicle is already stop.
	public void stop() {
		this.isStarted= false;
		System.out.println("Vehicle stopped.Its Chassis number is "+ this.chassisNo);
	}
	
	public void applyBreak() {
		System.out.println("Break applied.Its Chassis number is "+ this.chassisNo);
	}
	
}

class OilTanker extends BaseChassis{
	private int tankerOilCapacity;
	private float tankVolume;
	private String features;
	
	public OilTanker() {
		
	}
	
	public OilTanker(int tankerOilCapacity, float tankVolume, String features) {
		this.tankerOilCapacity= tankerOilCapacity;
		this.tankVolume= tankVolume;
		this.features= features;
	}
	public OilTanker(String chassisno,String transType, String fuelType,int fuelCapacity,int noOfWheels,int tankerOilCapacity, float tankVolume, String features) {
		super(chassisno,transType,fuelType,fuelCapacity,noOfWheels); // This automatically calls the constructor of base class
		this.tankerOilCapacity= tankerOilCapacity;
		this.tankVolume= tankVolume;
		this.features= features;
	}
	
	public int getTankerOilCapacity() {
		return this.tankerOilCapacity;
	}

	public void setTankerOilCapacity(int tankerOilCapacity) {
		this.tankerOilCapacity= tankerOilCapacity;
	}
	
	public float getTankVolume() {
		return this.tankVolume;
	}

	public void setTankVolume(float tankVolume) {
		this.tankVolume= tankVolume;
	}
	
	public String fetFeatures() {
		return this.features;
	}
	
	public void setFeatures(String features) {
		this.features = features;
	}
	
	public void fillOil() {
		System.out.println("Filing Oil; Vehicle Chassis number is "+this.chassisNo);
	}
}



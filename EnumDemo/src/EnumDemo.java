
public class EnumDemo {

	public static void main(String[] args) {
		order1(111, Size.Medium);
		order2(111, "xyz");
		isTodayHoliday(Day.Monday);
		
	 int quantity=15;
	  System.out.println("Price of "+ quantity +" Double Flats:"+Flat_Size.Double.pricePerQuantity(quantity)+" Pounds");
	}

	public static void isTodayHoliday(Day day) {
		switch (day) {
		case Sunday:
			System.out.println("Holiday");
			break;
		case Monday:
			System.out.println("Not Holiday");
			break;
		case Tuesday:
			System.out.println("Not Holiday");
			break;
		case Wednesday:
			System.out.println("Not Holiday");
			break;
		case Thursday:
			System.out.println("Not Holiday");
			break;
		case Friday:
			System.out.println("Not Holiday");
			break;
		case Saturday:
			System.out.println("Holiday");
			break;
		}
	}

	public static void order1(int quantity, Size size) {
		System.out.println("Order Quantity:" + quantity + " Size:" + size);
	}

	public static void order2(int quantity, String size) {
		System.out.println("Order Quantity:" + quantity + " Size:" + size);
	}
}

enum Size {
	Small, Medium, Large
}

enum Day {
	Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
}

enum Flat_Size{
	Single(1800,25000.00f),
	Double(2500,35000.00f),
	Triple(3800,50000.00f);
	
	private final int sizeInSquareFeet;
	private final float priceInPounds;
	
	Flat_Size(int size,float price){
		this.sizeInSquareFeet=size;
		this.priceInPounds=price;
	}
	
	public float pricePerQuantity(int nos) {
		return priceInPounds*nos;
	}
	public int getSize() {
		return this.sizeInSquareFeet;
	}
	
	public float getPrice() {
		return this.priceInPounds;
	}
}

// Daily Wage of a contract worker

// Sunday    ->  Hour - 75 Pounds
// Monday    ->  Hour - 55 Pounds
// Tuesday   ->  Hour - 50 Pounds
// Wednesday ->  Hour - 50 Pounds
// Thursday  ->  Hour - 50 Pounds
// Friday	 ->  Hour - 60 Pounds
// Saturday  ->  Hour - 65 Pounds

// How many pounds that a person has earned on any day. User has to give day and also no of hours.
// Use only enum and enum methods


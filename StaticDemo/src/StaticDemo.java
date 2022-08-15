
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer("Jiten","Palaparthi");
		Customer c2 = new Customer("Rahim","Mohammed");
		Customer c3 = new Customer("John","R");
		
		c1.ShowCustomerDetails();
		c2.ShowCustomerDetails();
		c3.ShowCustomerDetails();
		System.out.println("Total number of customers:"+Customer.getNumberOfPeople());
		
		int num= 37;
		boolean isPrime = IsPrimeNumberWhile(num);
		if(!isPrime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		// Write isPrimeNumberDoWhile(int num) using do while loop
		num=300;
		boolean isPrime1 = false;
		int count=2;
		
		do {
			if(num%count==0) {
				isPrime1=true;
				break;
			}
			count++;
		}while(count<num/2 && (num!=0 || num!=1));
		
		if(!isPrime1) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		
		// for loop prime number . Write it as a function IsPrimeNumberFor
		num=88;
		boolean isPrime2=false;
		for(int c=2;c<num/2 && (num!=0 || num!=1);c++) {
			if(num%c==0) {
				isPrime2 = true;
				break;
			}
		}
		if(!isPrime2) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
	}
	
	public static boolean IsPrimeNumberWhile(int num) {
		int count = 2;	
		boolean isPrime = false;
//				True && (True || True)
//				True && (True)
//				True
		while(count<num/2 && (num!=0 || num!=1)) { // usually no need to iterate num-1
			if(num%count==0) {
				isPrime=true;
				break;
			}
			count++;
		}
		return isPrime;
	}
}

// Create a class car
// number of wheels, color, engine capacity of the car.
// Create a new object called c1,c2,c3,c4
// Get total number of cars in the system by using static field/ method

// static members
// memory is allocated to the class not to an object.
// no need to call them through the object
// Static members belong to class not individual objects.
// call Static members directly with the class name.For example Customer.getNumberOfPeople()
class Customer{
	private String firstname;
	private String lastname;
	private  static int NumberOfPeople;
	
	// Constructor 
	// It is used to initialize values while creating an object.
	public Customer(String firstName,String lastName) {
		this.firstname = firstName;
		this.lastname = lastName;
		NumberOfPeople++; // This is static and it gets incremented for every Customer object creation
	}
	
	public  static int getNumberOfPeople() {
		return NumberOfPeople;
	}
	
	public String getFirstName() {
		return this.firstname;
	}
	
	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}
	public String getLastName() {
		return this.lastname;
	}
	
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	public void ShowCustomerDetails() {
		System.out.println("FirstName :"+this.firstname);
		System.out.println("LastName  :"+this.lastname);
	}
	
}
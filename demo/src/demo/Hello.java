package demo;

public class Hello {

	public static void main(String[] args) {
		method1();
		method2();
		System.out.println(method3());
		// creating an object for the class
		Customer c1 = new Customer("Jiten","Palaparthi");
		System.out.println("FirstName:"+c1.getFirstName());
		System.out.println("LastName :"+c1.getLastName());
	}
	
	public static void method1() {
		System.out.println("Hello");
	}
	
	public static void method2() {
		System.out.println("World");
	}
	
	public static String method3() {
		return "!";
	}
}

class Customer{
	private String firstname;
	private String lastname;
	
	public Customer(String fn, String ln) {
		this.firstname = fn;
		this.lastname=ln;
	}
	public String getFirstName() {
		return this.firstname;
	}
	public String getLastName() {
		return this.lastname;
	}
	
	public void setFirstName(String fn) {
		this.firstname=fn;
	}
	
	public void setLastName(String ln) {
		this.lastname =ln;
	}
	
}




public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cage<Customer> c1 = new Cage<Customer>();
		c1.add(new Customer("Jiten","Jitenp@outlook.com"));
		Customer cmr1 = c1.get();
		
		Cage<Car> c2 = new Cage<Car>();
		
		c2.add(new Car("Ford","Ecosports"));
		
		Car cr1 = c2.get();
		
		Cage<String> c3= new Cage<String>();
		
		c3.add("Hello World!");
		
		String str1 =c3.get();
	}

}

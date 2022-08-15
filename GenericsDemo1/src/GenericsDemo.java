import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList<Customer> ml = new MyList<Customer>();
		ml.addObject(new Customer("Jiten", "JitenP@Outlook.Com"));
		ml.addObject(new Customer("Alena", "Alena@Gmail.Com"));
		ml.addObject(new Customer("David", "David@Gmail.Com"));
		ml.addObject(new Customer("Ahemad", "Ahemad@Gmail.Com"));
//		ml.addObject("Hello World");
//		ml.addObject(new Car("Ford","Ecosport"));
		 
		ml.showDetails();

	}

}

class MyList<T> {
	
	public ArrayList list;

	public MyList() {
		list = new ArrayList();
	}

	public void addObject(T obj) {
		list.add(obj);
	}
	
	public void showDetails() {
		for(int i=0;i<list.size();i++) {
			T c = (T)list.get(i);
			System.out.println(c);
			//System.out.println("Name:"+c.name+" Email:"+c.email);
		}
	}

}

class Customer {
	public String name;
	public String email;

	public Customer(String name, String email) {
		this.email = email;
		this.name = name;
	}
}

class Car{
	public String make,model;
	public Car(String make,String model) {
		this.make=make;
		this.model=model;
	}
}

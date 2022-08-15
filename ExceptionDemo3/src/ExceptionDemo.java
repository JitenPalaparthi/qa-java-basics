
public class ExceptionDemo {

	public static void main(String[] args) throws IncorrectValueException {
		// TODO Auto-generated method stub
		Driver d1;
		try {
			d1 = new Driver();
			d1.setName("Karthik");
			d1.setAge(3);
			d1.setEmail("Karthil@Gmail.Com");
			// d1 = new Driver("Karthik", 3, "Karthik@Gmail.com");
			d1.showDetails();
		} catch (IncorrectValueException e) {
			// TODO Auto-generated catch block

			System.out.println(e.getMessage());
			System.out.println(e.getMoreInfo());
			// e.printStackTrace();
		} finally {
			d1 = new Driver("Jiten", 38, "JitenP@Outlook.Com");
			d1.showDetails();
		}
	}
}

class Driver {

	String name;

	int age;

	String email;

	public Driver() {

	}

	public Driver(String name, int age, String email) throws IncorrectValueException {
		if (age < 18) {
			throw new IncorrectValueException("age is less than 18 years exception");
		}
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) throws IncorrectValueException {
		if (age < 18) {
			throw new IncorrectValueException("age is less than 18 years exception");
		}
		this.age = age;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void showDetails() {
		System.out.println("Driver Details\nName:" + this.name + "\nAge:" + this.age + "\nEmail:" + this.email);
	}
}

// Custom/User Defined Exception
class IncorrectValueException extends Exception {
	public IncorrectValueException(String message) {
		super(message);
	}

	public String getMoreInfo() {
		return "Seems the value you are trying to assign is lesser than the given range";
	}
}


public class Contact {
	private int ID;
	private String name, email, address, status;

	public Contact() {

	}

	public Contact(String name, String email, String address, String status) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.status = status;

	}

	public int getID() {
		return this.ID;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}
	
	public String getAddress() {
		return this.address;
	}

	public String getStatus() {
		return this.status;
	}

}

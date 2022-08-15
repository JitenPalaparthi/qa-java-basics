
public class Student {
	private int id;
	private String name, address, email, contactNo, status, lastModified;

	public Student() {
	}

	public Student(String name, String email, String address, String contactNo) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.contactNo = contactNo;
	}
	
	public Student(int id,String name, String email, String address, String contactNo,String status,String lastModified) {
		this.id=id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.contactNo = contactNo;
		this.status=status;
		this.lastModified=lastModified;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLastModified() {
		return this.lastModified;
	}

}

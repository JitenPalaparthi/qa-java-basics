
public class AccessMdifiersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("100", "Jiten", "JitenP@Outlook.Com", "Bangalore, India", "9618558500");
		System.out.println("ID:" + p1.getID());
		System.out.println("Name:" + p1.getName());
		System.out.println("Email:" + p1.getEmail());
		System.out.println("ContactNo:" + p1.getContactno());
		System.out.println("Address:" + p1.getAddress());

	}

}

 class Person {
	private int ID;
	private String name;
	private String email;
	private String address;
	private String contactno;
	private String password; // readonly becase there is only a getter ; there is no setter
	
	public Person() {
		
	}

	private Person(int id) {
		this.ID = id;
	}

	public Person(String id, String name, String email, String address, String contactno) {
		this(Integer.parseInt(id)); // to call a constructor inside a constructor. Use this()
		this.name = name;
		this.email = email;
		this.address = address;
		this.contactno = contactno;
	}

	public int getID() {
		return this.ID;
	}

	public void setID(int id) {
		this.ID = id;
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

	public String getContactno() {
		return this.contactno;
	}

	public void setContactno(String no) {
		this.contactno = no;
	}
	
	public String getPassword() {
		return this.password;
	}
}
 
// Task
// Create a class and add few fields as public few of them as private
// BankAccountClass --> AcNo, Name, IFSCCOde,BANCode, BankName, BranchName, BandAddress
// private Constructor -> automatically give BankName as ABCDBank , when you give BranchName it should give BAN and IFSC code and Address automatically.
// public Constructor --> No,Name,BankName,BranchName
// Public Method to DisplayBankInfo : It should not display AcNo and Name but rest all
// Private Method to DisplayAcccountInfo: It should display all information but within the class..So this cannot be accesssed from main.
// but there should be a method.
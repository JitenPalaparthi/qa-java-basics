
public class Demo {

	public static void main(String[] args) {

		String jdbcConnectionURL = "jdbc:mysql://localhost:3306/demo";
		var sdb = new StudentDBHelper(jdbcConnectionURL, "root", "password");
		sdb.Create(new Student("Jiten", "JitenP@Outlook.Com", "Bangalore", "9618558500"));
		sdb.Create(new Student("Jack", "Jack@Outlook.Com", "London", "44660011"));
		sdb.CreateBy(new Student("Aleem", "Aleem.Basha@Outlook.Com", "Hyderabad", "95173331111"));

		var s1 = sdb.Read(2);
		System.out.println("ID:\t"+s1.getId() +" Name:\t"+ s1.getName() +" Email:\t"+ s1.getEmail() +" Address:\t"+ s1.getAddress() +" Contact Number\t"+ s1.getContactNo()+" Status:\t"+s1.getStatus()+" LastModified:\t"+s1.getLastModified());

		s1.setAddress("Yorkshire");
		s1.setContactNo("11111111");
		
		/*
		 * var s2 = sdb.UpdateBy(s1); System.out.println("ID:\t"+s2.getId() +" Name:\t"+
		 * s2.getName() +" Email:\t"+ s2.getEmail() +" Address:\t"+ s2.getAddress()
		 * +" Contact Number\t"+
		 * s2.getContactNo()+" Status:\t"+s2.getStatus()+" LastModified:\t"+s2.
		 * getLastModified());
		 */
		
		var list = sdb.ReadAll(10,10);
		
		System.out.println("Count-->"+list.size());
		
		System.out.println("-------------------------------------All Students---------------------------------------------------------------------------");
		for(Student s2:list) {
			System.out.println("ID:"+s2.getId() +" Name:"+ s2.getName() +" Email:"+ s2.getEmail() +" Address:"+ s2.getAddress() +" Contact Number"+ s2.getContactNo()+" Status:"+s2.getStatus()+" LastModified:"+s2.getLastModified());
		}
		
//		sdb.Delete(1);
//		var s2 = sdb.Read(1);
//		System.out.println(s2.getId() + s2.getName() + s2.getEmail() + s2.getAddress() + s2.getContactNo());

	}

}

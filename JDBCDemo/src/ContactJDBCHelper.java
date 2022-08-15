import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;

public class ContactJDBCHelper {

	String JDBCConURL, userName, passWord;

	public ContactJDBCHelper() {
	}

	public ContactJDBCHelper(String url, String userName, String passWord) {
		this.JDBCConURL = url;// String jdbcConnectionURL = "jdbc:mysql://localhost:3306/demo";
		this.userName = userName; // root
		this.passWord = passWord;// password
	}

	public void Create(Contact contact) {
		try {
			Connection con = DriverManager.getConnection(this.JDBCConURL, this.userName, this.passWord);
			Statement statement = con.createStatement();
			// insert into contacts(name,email,address,status)
			// values('Jiten','JitenP@Outlook.Com','Bangalore','active')
			var status = statement.execute("Insert into contacts(name,email,address,status) values('" + contact.getName() + "','"
					+ contact.getEmail() + "','" + contact.getAddress() + "','" + contact.getStatus() + "')");
			System.out.println("Record successfully inserted");
		} catch (SQLTimeoutException exp) {
			System.out.println("Failed to  insert record");
			System.out.println(exp.getMessage());

		} catch (SQLException exp) {
			System.out.println("Failed to  insert record");
			System.out.println(exp.getMessage());
		}
	}
	
	public Contact Read(int id) {
		// ToDO operation by you
		return null;
	}
	
	public void Delete(int id) {
		// TODO operation by you
	}
}

// Student Management System

// Student object --> ID, Name,Email, Address, ContactNO,Status,LastModified
// Create(Student)
// Read(ID)
// Update(Student)
// Delete(ID

// StudentCourse object--> ID, StudentID, CourseName,CourseDetails,EnrolledOn,LastModified
// Create(StudentCourse)
// Read(ID)
// Update(StudentCourse)
// Delete(ID)

// Enter Student name: 
// Enter Email:
// Enter Address:
// Enter ContactNo:
// Automatically Status ->active
// Automatically LastModified -> current date and time

// Enter Student ID:
// Enter Course Name:
// Enter Course Details:
// Automatically EntolledOn --Current Date and Time.
// Automatically Status -> active
// Automatically LastModified -> Current Date and Time








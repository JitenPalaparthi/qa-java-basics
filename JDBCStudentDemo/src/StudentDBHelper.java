import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDBHelper {

	String JDBCConURL, userName, passWord;

	public StudentDBHelper() {
	}

	public StudentDBHelper(String url, String userName, String passWord) {
		this.JDBCConURL = url;// String jdbcConnectionURL = "jdbc:mysql://localhost:3306/demo";
		this.userName = userName; // root
		this.passWord = passWord;// password
	}

	public void Create(Student student) {
		try {
			Connection con = DriverManager.getConnection(this.JDBCConURL, this.userName, this.passWord);
			Statement statement = con.createStatement();
			statement.execute("Insert into students(name,email,address,contactNo) values('" + student.getName() + "','"
					+ student.getEmail() + "','" + student.getAddress() + "','" + student.getContactNo() + "')");
			System.out.println("Record successfully inserted");
		} catch (SQLTimeoutException exp) {
			System.out.println("Failed to  insert record");
			System.out.println(exp.getMessage());

		} catch (SQLException exp) {
			System.out.println("Failed to  insert record");
			System.out.println(exp.getMessage());
		}
	}
	
	public void CreateBy(Student student) {
		try {
			Connection con = DriverManager.getConnection(this.JDBCConURL, this.userName, this.passWord);
			PreparedStatement  statement = con.prepareStatement("Insert into students(name,email,address,contactNo) values(?,?,?,?)");
			
			statement.setString(1,student.getName());
			statement.setString(2,student.getEmail());
			statement.setString(3,student.getAddress());
			statement.setString(4,student.getContactNo());
			
			int result =  statement.executeUpdate();
		
			
			System.out.println(result+" Record successfully inserted");
		} catch (SQLTimeoutException exp) {
			System.out.println("Failed to  insert record");
			System.out.println(exp.getMessage());

		} catch (SQLException exp) {
			System.out.println("Failed to  insert record");
			System.out.println(exp.getMessage());
		}
	}

	
	public Student UpdateBy(Student student) {
		try {
			Connection con = DriverManager.getConnection(this.JDBCConURL, this.userName, this.passWord);
			PreparedStatement  statement = con.prepareStatement("update students set address=? ,contactNo=? where id=?");
		
			statement.setString(1,student.getAddress());
			statement.setString(2,student.getContactNo());
			statement.setInt(3, student.getId());
			
			int result =  statement.executeUpdate();
		
			if(result==1) {
				return Read(student.getId());
			}
			
			System.out.println(result+" Record successfully inserted");
		} catch (SQLTimeoutException exp) {
			System.out.println("Failed to  insert record");
			System.out.println(exp.getMessage());

		} catch (SQLException exp) {
			System.out.println("Failed to  insert record");
			System.out.println(exp.getMessage());
		}
		return null;
	}
	
	public Student Read(int id) {
		try (Connection conn = DriverManager.getConnection(this.JDBCConURL, this.userName, this.passWord);
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM students WHERE id = " + id)) {

			resultSet.next();

			int _id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			String email = resultSet.getString("email");
			String address = resultSet.getString("address");
			String contactNo = resultSet.getString("contactNo");
			String status = resultSet.getString("status");
			String lastModified=resultSet.getString("lastModified");
			

			return new Student(_id, name, email, address, contactNo, status,lastModified);

		} catch (SQLException e) {
			System.out.println("Failed to  fetch record");
			System.out.println(e.getMessage());
		}
		return null;
	}

	//SELECT * FROM Orders LIMIT 10 OFFSET 15
	public List<Student> ReadAll(int limit,int offset) {
		try (Connection conn = DriverManager.getConnection(this.JDBCConURL, this.userName, this.passWord);
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM students LIMIT "+limit+" OFFSET "+offset)) {

			List<Student> list = new ArrayList<Student>();
			   while(resultSet.next()) {
					int _id = resultSet.getInt("id");
					String name = resultSet.getString("name");
					String email = resultSet.getString("email");
					String address = resultSet.getString("address");
					String contactNo = resultSet.getString("contactNo");
					String status = resultSet.getString("status");
					String lastModified=resultSet.getString("lastModified");
					list.add(new Student(_id, name, email, address, contactNo, status,lastModified));
			   }
			
			return list;

			//return new Student(_id, name, email, address, contactNo, status,lastModified);

		} catch (SQLException e) {
			System.out.println("Failed to  fetch record");
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public void Delete(int id) {
		// delete from students where id=id
		try {
			Connection con = DriverManager.getConnection(this.JDBCConURL, this.userName, this.passWord);
			Statement statement = con.createStatement();
			statement.execute("delete from students where id=" + id);

		} catch (SQLTimeoutException exp) {
			System.out.println("Failed to  delete record");
			System.out.println(exp.getMessage());

		} catch (SQLException exp) {
			System.out.println("Failed to  delete record");
			System.out.println(exp.getMessage());
		}
	}

    
   
}

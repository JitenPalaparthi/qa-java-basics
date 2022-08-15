
import java.sql.*;
import java.sql.SQLTimeoutException;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String jdbcConnectionURL = "jdbc:mysql://localhost:3306/demo";
			var cdb= new ContactJDBCHelper(jdbcConnectionURL,"root","password");
			cdb.Create(new Contact("Jack","Jack@Gmail.Com","London","active"));	
	}
}



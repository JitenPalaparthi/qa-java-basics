package jdbcdemo1;

import java.sql.*;

public class Deno {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
        String jdbcConnectionURL = "jdbc:mysql://localhost:3306/demo";
        Connection con = DriverManager.getConnection(jdbcConnectionURL, "root", "password");
		

	}

}

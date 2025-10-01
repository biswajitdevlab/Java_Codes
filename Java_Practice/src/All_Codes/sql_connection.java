package All_Codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sql_connection {
	public static void main(String[]args) throws SQLException {
		Connection conn= DriverManager.getConnection("","","");
		Statement s= conn.createStatement();
		String st="Select*from employees";
		s.execute(st);s.close();
		
		
	}
	}
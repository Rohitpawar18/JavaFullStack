import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ConnectionDemo {

	public static void main(String[] args) {
		
//		String url = "jdbc:mysql://localhost:3306/javatraining";
		
		try {
//			DriverManager.registerDriver(new Driver());
//			Connection conn = DriverManager.getConnection(url, "root", "dbms");
			
			Connection conn = JdbcFactory.getConnection();
			System.out.println("Conenction Successful");
			
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB Name : " + meta.getDatabaseProductName());
			System.out.println("DB Version : " + meta.getDatabaseProductVersion());
			System.out.println("Driver Name : " + meta.getDriverName());
			System.out.println("Driver Version : " + meta.getDriverVersion());
			
		} catch (SQLException e) {
			System.out.println("Connection failed due to...	");
			e.printStackTrace();
		}
	}

}

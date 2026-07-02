import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		// ? is called place-holder, index start from 1
		String sql = "insert into cust values (?, ?, ?)";
		
		try {
			Connection conn = JdbcFactory.getConnection();
			
			//Creating statement to perform
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			//Replacing palce-holders with command line args values
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setString(3, args[2]);
			
			stmt.executeUpdate();
			System.out.println("Record Inserted...");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}

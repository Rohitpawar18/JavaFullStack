import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class StatementDemo {
	public static void main(String[] args) {
		
		String sql = "insert into cust values (13, 'Jack', 'Delhi')";
		
		try {
			Connection conn = JdbcFactory.getConnection();
			
			//create statement to execute hard coded query
			Statement stmt = conn.createStatement();
			
			//performing DML operation
			stmt.executeUpdate(sql);
			System.out.println("Record Inserted!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}

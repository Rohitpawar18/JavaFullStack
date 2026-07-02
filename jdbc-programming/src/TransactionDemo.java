import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.main.JdbcFactory;

public class TransactionDemo {

	public static void main(String[] args) {
		
		String sql1 = "insert into cust values (19, 'Nik', 'Noida')";
		String sql2 = "update cust set city = 'Madurai' where cid = 11";
		String sql3 = "delete from cust where cid = 15";
		
		Connection conn = null;
		try {
			conn = JdbcFactory.getConnection();
			conn.setAutoCommit(false); // Turning off auto-commit
			
			Statement stmt = conn.createStatement();
			// Adding all 3 queries as a batch
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			//Executing batch of 3 DML Queries
			stmt.executeBatch();
			//Everything goes fine then committing the transaction
			conn.commit();
			System.out.println("Transaction Completed!");
		} catch (SQLException e) {
			System.out.println("Transaction Failed!!");
			
			try {
				conn.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			
			e.printStackTrace();
		}
	}

}

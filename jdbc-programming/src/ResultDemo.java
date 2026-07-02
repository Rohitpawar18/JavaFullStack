import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.main.JdbcFactory;

public class ResultDemo {

	public static void main(String[] args) {
		
		String sql = "select * from cust";
		
		try {
			Connection conn = JdbcFactory.getConnection();
			
			Statement stmt = conn.createStatement();
			
			//Executing in DQL operation and getting results into ResultSet
			ResultSet rs = stmt.executeQuery(sql);
//			while(rs.next()) {
//				System.out.println(rs.getInt("cid") + ", " +
//						rs.getString(2) + ", " + rs.getString(3));
//			}
			
			System.out.println();
			ResultSetMetaData meta = rs.getMetaData();
			System.out.println(meta.getColumnCount());
			
			System.out.println();
			while(rs.next()) {
				for(int c = 1; c <= meta.getColumnCount(); c++) {
					System.out.print(rs.getString(c) + ", ");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}

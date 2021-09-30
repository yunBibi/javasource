package dept;

import java.sql.Connection;
import java.sql.DriverManager;

public class DeptDAO {
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@172.30.1.54";
		String user = "c##scott";
		String password = "tiger";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
				return con;
	}
	
	
	
}

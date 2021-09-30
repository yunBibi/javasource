package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public static void main(String[] args) {
		// 드라이버 로드
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
		// 연결 시도
			String url = "jdbc:oracle:thin:@172.30.1.54";
			String user = "c##scott";
			String password = "tiger";
			
			con = DriverManager.getConnection(url, user, password);
			
			if(con!=null) {
				System.out.println("연결되었습니다.");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

	// 부서정보 전체 가져오기 select * from dept_temp;
	public List<DeptDTO> getRows() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<DeptDTO> list = new ArrayList<DeptDTO>();

		try {
			con = getConnection();
			String sql = "select * from dept_temp";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				DeptDTO dto = new DeptDTO();

				dto.setDeptNo(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				list.add(dto);

			}

		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}

	// 특정 부서 정보 가져오기 select * from dept_temp where deptno = ?;
	public DeptDTO getRow(int deptno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DeptDTO dto = null;

		try {
			String sql = "select * from dept_temp where deptno = ?";
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto = new DeptDTO();
				dto.setDeptNo(rs.getInt(1));
				dto.setDname(rs.getString(2));
				dto.setLoc(rs.getString(3));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;

	}

	// 새로운 부서 입력 insert into dept_temp(deptno, dname, loc) values(?,?,?);
	public boolean insert(DeptDTO dto) {
		boolean flag = false;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = getConnection();
			String sql = "insert into dept_temp(deptno, dname, loc) values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getDeptNo());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());

			int result = pstmt.executeUpdate();
			if (result > 0) {
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return flag;

	}

	// 부서명 변경 : update dept_temp set dname =? where deptNo=?
	public boolean update(String dname, int deptNo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean flag = false;

		try {
			String sql = "update dept_temp set dname =? where deptNo=?";
			con=getConnection();
					
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setInt(2, deptNo);
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}return flag;
		
		
		// delete from dept_temp where deptno =?
		// delete
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


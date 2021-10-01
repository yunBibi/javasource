package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// JDBC
// ~DAO : database와 관련된 작업을 하는 클래스를 의미
// 커넥션, 조회(select), 삽입, 삭제, 수정

public class EmpDAO {
	// 커넥션 걸기

	// 1. 드라이버 로드
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 2. 커넥션 걸기
	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@172.30.1.54";
		String user = "c##scott";
		String password = "tiger";
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public List<EmpDTO> select() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmpDTO dto = null;

		List<EmpDTO> list = new ArrayList<EmpDTO>();

		try {
			con = getConnection();
			String sql = "select * from emp_temp";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) { // 하나의 행에서 필드별로 가져오기 + EmpDTO에 담기
				dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
				list.add(dto);
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
		return list;

	}

	// 특정 사원 조회
	public EmpDTO getRow(int empno) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		EmpDTO dto = null;

		try {
			con = getConnection();
			// String sql = "select * from emp where empno = " + empno;

			String sql = "select *from emp_temp where empno = ?";
			pstmt = con.prepareStatement(sql);

			// 물음표에 대한 처리
			pstmt.setInt(1, empno);

			rs = pstmt.executeQuery();
			if (rs.next()) { // 하나의 행에서 필드별로 가져오기 + EmpDTO에 담기
				dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
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

	// 급여 오름차순
	public List<EmpDTO> orderBySal() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<EmpDTO> list = new ArrayList<EmpDTO>();

		try {
			con = getConnection();
			// 커넥션을 통해 SQL문 보내기
			String sql = "select ename, sal from emp_temp dorder by sal";
			pstmt = con.prepareStatement(sql);
			// sql구문 실행
			rs = pstmt.executeQuery();
			// 받은 결과를 리턴
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEname(rs.getString(1));
				dto.setSal(rs.getInt(2));
				list.add(dto);

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
		return list;
	}

	// 특정 사원의 급여 수정
	public boolean updateSal(int empno, int sal) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean updateFlag = false;

		try {
			con = getConnection();

			String sql = "update emp_temp set sal =? where empno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, sal);
			pstmt.setInt(2, empno);

			int result = pstmt.executeUpdate();
			if (result > 0) { // update 성공
				updateFlag = true;

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
		return updateFlag; // true면 업데이트 성공, false면 업데이트 실패
	}

	// 특정 사원의 추가수당 수정
	public boolean updateComm(int comm, int sal) {

		Connection con = null;
		PreparedStatement pstmt = null;
		boolean updateFlag = false;

		try {
			con = getConnection();
			String sql = "update emp_temp set comm=? where sal <= ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, comm);
			pstmt.setInt(2, sal);
			
			int result = pstmt.executeUpdate();
			if(result >0) {
				updateFlag = true;
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return updateFlag;
	}

}

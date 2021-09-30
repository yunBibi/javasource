  package emp;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		EmpDAO dao = new EmpDAO();

		while (run) {
			System.out.println("==========================");
			System.out.println("1. 개별 조회");
			System.out.println("2. 전체 조회");
			System.out.println("3. 급여 오름차순 조회");
			System.out.println("4. 금여 수정");
			System.out.println("5. 종료");
			System.out.println("==========================");

			System.out.print("입력 >> ");
			int no = sc.nextInt();

			switch (no) {
			case 1:
				System.out.print("조회할 사원 번호 입력 : ");
				int empno = sc.nextInt();
			    EmpDTO dto = dao.getRow(empno);
			    
			    if(dto == null) {
			    	System.out.println("\n데이터 없음");
			    } else {
			    	System.out.println("\n사번\t이름\t직무\t매니저\t입사일\t\t급여\t보너스\t부서번호");
			    	System.out.print(dto.getEmpno()+"\t");
			    	System.out.print(dto.getEname()+"\t");
			    	System.out.print(dto.getJob()+"\t");
			    	System.out.print(dto.getMgr()+"\t");
			    	System.out.print(dto.getHiredate()+"\t");
			    	System.out.print(dto.getSal()+"\t");
			    	System.out.print(dto.getComm()+"\t");
			    	System.out.println(dto.getDeptno()+"\n");
			    }
				break;

			case 2:
				List<EmpDTO> list = dao.select();
				System.out.println("\n사번\t이름\t직무\t매니저\t입사일\t\t급여\t보너스\t부서번호");
				// 리스트에 들어 있는 내용 출력
				for(EmpDTO dto1 : list) {
					System.out.print(dto1.getEmpno()+"\t");
			    	System.out.print(dto1.getEname()+"\t");
			    	System.out.print(dto1.getJob()+"\t");
			    	System.out.print(dto1.getMgr()+"\t");
			    	System.out.print(dto1.getHiredate()+"\t");
			    	System.out.print(dto1.getSal()+"\t");
			    	System.out.print(dto1.getComm()+"\t");
			    	System.out.print(dto1.getDeptno()+"\n");
				}
				
				dao.select();
				break;
				
			case 3: 
				System.out.println("사원별 급여 오름차순 조회");
				System.out.println("사원명\t급여");
				list = dao.orderBySal();
				for(EmpDTO dto2 : list) {
					System.out.print(dto2.getEname()+"\t");
					System.out.print(dto2.getSal()+"\n");
					
				}
				System.out.println();
				
				break;
				
			case 4:
				empno = 1111;
				int sal = 1500;
				
				
				break;
				
			case 5:
				run = false;
				break; 
			default:
				System.out.println("번호를 확인해 주세요.");
				break;
			}

		}

	}

}

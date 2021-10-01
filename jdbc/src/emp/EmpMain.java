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
			System.out.println("1. ���� ��ȸ");
			System.out.println("2. ��ü ��ȸ");
			System.out.println("3. �޿� �������� ��ȸ");
			System.out.println("4. �޿� ����");
			System.out.println("5. �߰����� ����");
			System.out.println("6. ����");
			System.out.println("==========================");

			System.out.print("�Է� >> ");
			int no = sc.nextInt();

			switch (no) {
			case 1:
				System.out.print("��ȸ�� ��� ��ȣ �Է� : ");
				int empno = sc.nextInt();
				EmpDTO dto = dao.getRow(empno);

				if (dto == null) {
					System.out.println("\n������ ����");
				} else {
					System.out.println("\n���\t�̸�\t����\t�Ŵ���\t�Ի���\t\t�޿�\t���ʽ�\t�μ���ȣ");
					System.out.print(dto.getEmpno() + "\t");
					System.out.print(dto.getEname() + "\t");
					System.out.print(dto.getJob() + "\t");
					System.out.print(dto.getMgr() + "\t");
					System.out.print(dto.getHiredate() + "\t");
					System.out.print(dto.getSal() + "\t");
					System.out.print(dto.getComm() + "\t");
					System.out.println(dto.getDeptno() + "\n");
				}
				break;

			case 2:
				List<EmpDTO> list = dao.select();
				System.out.println("\n���\t�̸�\t����\t�Ŵ���\t�Ի���\t\t�޿�\t���ʽ�\t�μ���ȣ");
				// ����Ʈ�� ��� �ִ� ���� ���
				for (EmpDTO dto1 : list) {
					System.out.print(dto1.getEmpno() + "\t");
					System.out.print(dto1.getEname() + "\t");
					System.out.print(dto1.getJob() + "\t");
					System.out.print(dto1.getMgr() + "\t");
					System.out.print(dto1.getHiredate() + "\t");
					System.out.print(dto1.getSal() + "\t");
					System.out.print(dto1.getComm() + "\t");
					System.out.print(dto1.getDeptno() + "\n");
				}

				dao.select();
				break;

			case 3:
				System.out.println("����� �޿� �������� ��ȸ");
				System.out.println("�����\t�޿�");
				list = dao.orderBySal();
				for (EmpDTO dto2 : list) {
					System.out.print(dto2.getEname() + "\t");
					System.out.print(dto2.getSal() + "\n");

				}
				System.out.println();

				break;

			case 4:
				
				System.out.print("\n���� ��� ��ȣ : ");
				empno = sc.nextInt();
				System.out.print("\n���� �޿� : ");
				int sal = sc.nextInt();
				boolean updateFlag = dao.updateSal(empno, sal);
				System.out.println(updateFlag ? "������Ʈ ����" : "������Ʈ ����");
				System.out.println();
				break;

			case 5:
				
				System.out.print("\n���� �޿� : ");
				sal = sc.nextInt();
				System.out.print("�߰� ���� : ");
				int comm = sc.nextInt();
				updateFlag=dao.updateComm(comm, sal);
				System.out.println(updateFlag?"������Ʈ ����":"������Ʈ ����");
				break;
				
			case 6:
				run = false;
				break;
			default:
				System.out.println("��ȣ�� Ȯ���� �ּ���.");
				break;
			}

		}

	}

}

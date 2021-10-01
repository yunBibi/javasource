package dept;

import java.util.List;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		DeptDAO dao = new DeptDAO();

		while (run) {
			System.out.println("*************************");
			System.out.println("1. ��ü �μ� ��ȸ");
			System.out.println("2. Ư�� �μ� ��ȸ");
			System.out.println("3. �μ� �߰�");
			System.out.println("4. �μ� ����");
			System.out.println("5. �μ� ����");
			System.out.println("6. ����");
			System.out.println("*************************");

			System.out.println("���� >> ");
			int menu = sc.nextInt();

			switch (menu) {

			case 1:
				List<DeptDTO> list = dao.getRows();

				System.out.println("�μ���ȣ\t�μ���\t����");
				for (DeptDTO dto : list) {
					System.out.print(dto.getDeptNo() + "\t");
					System.out.print(dto.getDname() + "\t");
					System.out.print(dto.getLoc());

				}
				System.out.println();
				break;

			case 2:
				System.out.println("\n��ȸ �μ���ȣ �Է�");
				int deptNo = sc.nextInt();

				DeptDTO dto1 = dao.getRow(deptNo);
				System.out.println("��ȸ ������ ������ �����ϴ�.");
				System.out.println("�μ���ȣ : " + dto1.getDeptNo());
				System.out.println("�μ��� : " + dto1.getDname());
				System.out.println("��ġ : " + dto1.getLoc());
				System.out.println();
				break;

			case 3:
				System.out.println("�μ� �߰�");
				System.out.print("�μ� ��ȣ : ");
				int newDeptNo = sc.nextInt();
				System.out.println("�μ��� : ");
				String newDname = sc.next();
				System.out.println("���� : ");
				String newLoc = sc.next();
				DeptDTO dto = new DeptDTO(newDeptNo, newDname, newLoc);
				System.out.println(dao.insert(dto) ? "�μ� �Է� ����" : "����");
				System.out.println();

				break;

			case 4:
				System.out.println("\n�μ� ����");
				System.out.println("���� �μ� ��ȣ : ");
				int updateDeptNo = sc.nextInt();
				System.out.println("���� �μ��� : ");
				String updateDname = sc.next();

				System.out.println(dao.update(updateDname, updateDeptNo) ? "�μ� ���� ����" : "����");

				break;
				
			case 5:
//				System.out.println("\n�μ� ����");
//				System.out.println("������ �μ� ��ȣ : ");
//				int removeDeptNo = sc.nextInt();
//				
//				System.out.println(dao.delete(removeDeptNo) ? "�μ� ���� ����":"�μ� ���� ����");
			
				
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

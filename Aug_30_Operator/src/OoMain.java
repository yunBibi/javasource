import java.util.Scanner;

public class OoMain {
	public static void main(String[] args) throws InterruptedException {
		
		/* ����
		 * �񸸵� �˻�-----
		 * �̸� : 
		 * Ű : 
		 * ������ :
		 * -----------
		 * ǥ��ü�� : xx.xxkg
		 * �񸸵� : xx.�ˤ�%
		 * zzz���� ""
		 * 
		 * (ǥ��ü�� = (Ű-100)*0.9
		 * �񸸵� = ������/ǥ��ü�� *100 
		 * 120 �ʰ��ϸ� ��, �ƴϸ� ����
		 */
		
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("�񸸵� �˻�------");
		
		System.out.print("�̸� : ");
		String name = k.next();
		
		System.out.print("Ű : ");
		double height = k.nextDouble();
		
		System.out.print("������ : ");
		double weight = k.nextDouble();
		
		System.out.println("------------");
		
		double av = (height - 100) * 0.9;
		double ob = (weight / av) * 100;
		String result = (ob > 120) ? "��" : "����";  
				
		System.out.printf("ǥ��ü�� : %.2fkg\n", av);
		System.out.printf("�񸸵� : %.2f\n", ob );
		System.out.printf("%s���� %s\n", name, result);   // <- �� �� �κ�
		
		System.out.println("���Ḧ ���Ͻø� �ƹ� Ű�� ��������.");
		String t = k.next();
		
		Thread.sleep(3000);
		
	}
}

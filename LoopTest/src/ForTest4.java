import java.util.Scanner;

public class ForTest4 {
	public static void main(String[] args) {
		// ����ڿ��� ������ �ܼ� �Է¹ޱ�
		
		Scanner k = new Scanner(System.in);
		System.out.print("������ �� ���� �Է��ϼ��� : ");
		
		int a = k.nextInt(); 
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n",a , i, (a*i));
		}
	}
}


import java.util.Scanner;

public class bimandoCheck {
	public static void main(String[] args) throws InterruptedException {
	
		Scanner k = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = k.next();
		
		System.out.print("Ű : ");
		double height = k.nextDouble();
		
		if (height >=3) {
			height /= 100;
		}
		
		System.out.print("������ : ");
		double weight = k.nextDouble();
		
		double bmi = weight / (height*height);
		
		String result = "��ü��";
		if (bmi > 35) {
			result = "����";
		} else if (bmi >=30) {
			result = "�ߵ���";
		} else if (bmi >= 25) {
			result = "�浵��";
		} else if (bmi >= 23) {
			result = "��ü��";
		} else if (bmi >= 18.5) {
			result = "����";
		} 
		
		System.out.println("------------");
		Thread.sleep(3000);
		System.out.printf("BMI : %.2f\n", bmi);
		System.out.printf("%s���� %s�Դϴ�.", name, result);
		
	}
}
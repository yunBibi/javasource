
import java.util.Scanner;

public class bimandoCheck {
	public static void main(String[] args) throws InterruptedException {
	
		Scanner k = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = k.next();
		
		System.out.print("키 : ");
		double height = k.nextDouble();
		
		if (height >=3) {
			height /= 100;
		}
		
		System.out.print("몸무게 : ");
		double weight = k.nextDouble();
		
		double bmi = weight / (height*height);
		
		String result = "저체중";
		if (bmi > 35) {
			result = "고도비만";
		} else if (bmi >=30) {
			result = "중도비만";
		} else if (bmi >= 25) {
			result = "경도비만";
		} else if (bmi >= 23) {
			result = "과체중";
		} else if (bmi >= 18.5) {
			result = "정상";
		} 
		
		System.out.println("------------");
		Thread.sleep(3000);
		System.out.printf("BMI : %.2f\n", bmi);
		System.out.printf("%s씨는 %s입니다.", name, result);
		
	}
}
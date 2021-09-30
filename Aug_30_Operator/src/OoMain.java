import java.util.Scanner;

public class OoMain {
	public static void main(String[] args) throws InterruptedException {
		
		/* 예제
		 * 비만도 검사-----
		 * 이름 : 
		 * 키 : 
		 * 몸무게 :
		 * -----------
		 * 표준체중 : xx.xxkg
		 * 비만도 : xx.ㅛㅛ%
		 * zzz씨는 ""
		 * 
		 * (표준체중 = (키-100)*0.9
		 * 비만도 = 몸무게/표준체중 *100 
		 * 120 초과하면 비만, 아니면 정상
		 */
		
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("비만도 검사------");
		
		System.out.print("이름 : ");
		String name = k.next();
		
		System.out.print("키 : ");
		double height = k.nextDouble();
		
		System.out.print("몸무게 : ");
		double weight = k.nextDouble();
		
		System.out.println("------------");
		
		double av = (height - 100) * 0.9;
		double ob = (weight / av) * 100;
		String result = (ob > 120) ? "비만" : "정상";  
				
		System.out.printf("표준체중 : %.2fkg\n", av);
		System.out.printf("비만도 : %.2f\n", ob );
		System.out.printf("%s씨는 %s\n", name, result);   // <- 못 한 부분
		
		System.out.println("종료를 원하시면 아무 키나 누르세요.");
		String t = k.next();
		
		Thread.sleep(3000);
		
	}
}

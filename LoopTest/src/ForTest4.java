import java.util.Scanner;

public class ForTest4 {
	public static void main(String[] args) {
		// 사용자에게 구구단 단수 입력받기
		
		Scanner k = new Scanner(System.in);
		System.out.print("구구단 단 수를 입력하세요 : ");
		
		int a = k.nextInt(); 
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n",a , i, (a*i));
		}
	}
}

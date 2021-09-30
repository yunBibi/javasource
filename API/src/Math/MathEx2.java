package Math;

public class MathEx2 {

	public static void main(String[] args) {
//		Math.random();

		// 세 개의 랜덤값을 구하기(1~3까지 나오도록)
	
		while (true) {
			int num1 = (int) (Math.random() * 3 + 1);
			int num2 = (int) (Math.random() * 3 + 1);
			int num3 = (int) (Math.random() * 3 + 1);
			
			System.out.printf("%d\t%d\t%d", num1,num2,num3);
			System.out.println();
			if (num1 == num2 && num1 == num3) {
				break;
			}
		}
	}

}

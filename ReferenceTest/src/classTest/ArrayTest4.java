package classTest;

public class ArrayTest4 {
	public static void main(String[] args) {
		int score[] = {78,65,95,88,36,45,25,47,87,43};
		
		// ��� ����
		
		int sum = 0;
//		for(int i=0; i<score.length; i++) {
//			sum = sum + score[i];      // == sum+=score[i]
//		}
		
		for(int jumsu:score) {
			sum+=jumsu;
		}
			
		System.out.printf("�հ� : %d, ��� : %d", sum, sum/score.length);
	}
}

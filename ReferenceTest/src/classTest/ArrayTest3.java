package classTest;

public class ArrayTest3 {

	public static void main(String[] args) {
		// int Ÿ���� �迭 5�� ����
		// 0 10 20 30 40 
		
		int score[] = {0,10,20,30,40};
		
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i] + "\t");
		}
		
		
		System.out.println();
		
		// String Ÿ���� �迭 5�� ����
		// ���� �̸����� �ʱ�ȭ
		
		String fruit[] = {"���", "����", "����", "��", "��"};
		
//		for(int i=0; i<fruit.length; i++) {
//			System.out.print(fruit[i]+"\t");
//		}
		
		// ���� for��   <- �迭 ���� ��� ����
		// for(�迭�� Ÿ�� ����κ���:�迭�̸�)
		// �ٸ� ó�� ���� �ϳ��� ������ ����ϴ� ����� �� ����
		
		for(String f:fruit) {
			System.out.print(f+"\t");
		}
		
		System.out.println();
		
		for(int idx:score) {
			System.out.print(idx+"\t");
		}
	}

}

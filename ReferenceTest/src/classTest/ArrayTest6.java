package classTest;

public class ArrayTest6 {
	public static void main(String[] args) {
		// ������ �迭
		int scores[][] = new int[2][3];
		
		// �ʱ�ȭ
		scores[0][0] = 15;
		scores[0][1] = 25;
		scores[0][2] = 35;
		
		scores[1][0] = 45;
		scores[1][1] = 55;
		scores[1][2] = 65;
		
		// Ȯ��
		System.out.println("�迭 ����(��) :"+scores.length);
		System.out.println("�迭 ����(��) :"+scores[0].length);
		
		for(int i=0;i<scores.length;i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+ " ");
			}
			System.out.println();
		}
				
		for(int a[]:scores) {
			for(int b:a) {
				System.out.print(b+"  ");
			}
			System.out.println();
		}
		
		int arr[][] = {
				{15,25},
				{65,85,95}
		};
		
		// �迭�� ���
		System.out.println(scores);  // [[I@2a139a55     <- �迭�� ����Ÿ���̱� ������
		System.out.println(arr);     // [[I@15db9742        ������ �ƴ� �ּҰ� ������ ��
	}
}

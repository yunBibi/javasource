package classTest;

public class ArrayTest8 {
	public static void main(String[] args) {
		// ī�� 45�� (1~45��)
		
		int card[] = new int[45];
		
		for(int i=0; i<card.length; i++) {
			card[i] = i+1;
		}
		
		for(int no:card) {
			System.out.print(no+" ");
		}
		
		// ī�� ����
		 for(int i=0;i<card.length; i++) {
			// �ٲ� ��ġ ����
			int pos = (int) (Math.random()*45);
			int temp = card[i];
			card[i] = card[pos];
			card[pos] = temp;
		} 
		 
		System.out.println();
		
		for(int no:card) {
			System.out.print(no+" ");
		
	}
	}
}
		
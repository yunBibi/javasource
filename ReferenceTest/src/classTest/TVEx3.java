package classTest;

public class TVEx3 {
	public static void main(String[] args) {
		// TV3 ��ü�� 3�� �����ϰ� �ʹ�
		
		TV3 tvArr[] = new TV3[3];
		
		tvArr[0] = new TV3("����", true, 5);
		tvArr[1] = new TV3("����", false, 6);
		tvArr[2] = new TV3("���", true, 2);
		
		printArr(tvArr);
	}
	
	static void printArr(TV3 tvArr[]) {
		for (int i = 0; i < tvArr.length; i++) {
			System.out.println("TV���� "+tvArr[i].getColor());
			System.out.println("TV���� "+tvArr[i].isPower());
			System.out.println("TVä�� "+tvArr[i].getChannel());
			System.out.println();
		}
	}
}

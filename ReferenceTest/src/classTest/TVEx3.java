package classTest;

public class TVEx3 {
	public static void main(String[] args) {
		// TV3 객체를 3개 생성하고 싶다
		
		TV3 tvArr[] = new TV3[3];
		
		tvArr[0] = new TV3("빨강", true, 5);
		tvArr[1] = new TV3("검정", false, 6);
		tvArr[2] = new TV3("흰색", true, 2);
		
		printArr(tvArr);
	}
	
	static void printArr(TV3 tvArr[]) {
		for (int i = 0; i < tvArr.length; i++) {
			System.out.println("TV색상 "+tvArr[i].getColor());
			System.out.println("TV전원 "+tvArr[i].isPower());
			System.out.println("TV채널 "+tvArr[i].getChannel());
			System.out.println();
		}
	}
}

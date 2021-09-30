package classTest;
public class TriangleEx3 {

	public static void main(String[] args) {
		// 길이가 서로 다른 삼각형 5개를 가지고 있다.
		// 넓이 구하기
		Triangle3 triangle1[] = new Triangle3[5];
		
		triangle1[0] = new Triangle3(4, 3);
		triangle1[1] = new Triangle3(6, 3);
		triangle1[2] = new Triangle3(8, 3);
		triangle1[3] = new Triangle3(10, 3);
		triangle1[4] = new Triangle3(12, 3);
		
		triangle1(triangle1);
		
	}
	static void triangle1(Triangle3 triangle1[]) {
		// 면적 구하기
		for (int i = 0; i < triangle1.length; i++) {
			
		}
	}
}

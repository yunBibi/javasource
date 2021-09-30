// 메소드(기본타입) => 값의 복사
// 메소드 (참조타입) => 주소 복사
//                   여러 개의 메소드가 동일한 객체를 참조할 수 있도록 만들어주는 방법
package classTest;

public class DataEx {

	public static void main(String[] args) {
		
		Data data = new Data();
		System.out.println("data : "+data); // classTest.Data@2a139a55
		
		// x의 값을 10이로 지정
//		data.x = 10;
//		change(data.x);
//		System.out.println("after change() x = "+data.x);
		
//		System.out.println();
		
		change(data);
		System.out.println("after change() x = " +data.x);
	}
	
	static void change(int x) { 
		x = 10000;
		System.out.println("change() x = "+x);
	}
	
	static void change(Data d) {
		System.out.println(d);
		
		d.x = 10000;
	}
	
}


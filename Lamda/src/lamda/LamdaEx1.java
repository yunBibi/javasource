package lamda;

public class LamdaEx1 {
	public static void main(String[] args) {
//		// 전통적인 익명구현 방식
//		LamdaTest1 obj1 = new LamdaTest1() {
//		@Override
//		public void methd1() {
//			System.out.println("함수형 인터페이스");
//			int i = 10;
//			System.out.println(i*i);
//			}
//		};
//		obj1.methd1();
		
		
		
		LamdaTest1 obj = () -> System.out.println("함수형 인터페이스");
		obj.methd1();
		
		obj = () -> {
			int i = 10;
			System.out.println(i*i);
			
		};
		obj.methd1();
	}

}

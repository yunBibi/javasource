package lamda;

public class LamdaEx5 {
	// 매개변수로 전달하는 람다식
	public static void execute(LamdaTest5 lamda) {
		lamda.run();
	}
	
	// 반환값으로 쓰이는 람다식
	public static LamdaTest5 getRun() {
		LamdaTest5 obj1 = () -> System.out.println("함수형 인터페이스 리턴");
		return obj1;
	}
	
	public static void main(String[] args) {
		// 람다식
		LamdaTest5 lamda = () -> System.out.println("Lamda!!!! run");
		lamda.run();
		
		System.out.println("---------------------");
		execute(lamda);
		System.out.println("---------------------");
	}
}

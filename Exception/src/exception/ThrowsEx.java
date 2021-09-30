package exception;

public class ThrowsEx {
	// main 에서 throws 의 의미 
	// throws ClassNotFoundException : JVM 한테 던져진다는 의미 (에러화면이 출력된다.)
	public static void main(String[] args) /*throws ClassNotFoundException*/ {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 여기에서 발생한 예외를 이 메소드를 호출하는 곳으로 던지겠다는 의미(throws)
	public static void findClass() throws ClassNotFoundException {
		Class.forName("");
	}
}

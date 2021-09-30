// 1번 줄과 5번줄에 쓰지 않는다. 3번 줄에 써야 한다. 
public class PrintMain {
	// 모든 코드는 이 영역에
	public static void main(String[] args) {
		// 여기 쓴 것만 실행됨

		////////// 자바의 출력 3종 세트

		// .print : 콘솔에 출력 <- 한국어로 설계. 이를 Java로 번역하면
		System.out.print("에어콘 리모콘이 어디 있지?");
		System.out.print("저녁 뭐 먹지");

		// .println : 콘솔에 출력 후, 줄 바꿈까지 포함
		System.out.println("에어콘 리모콘이 어디 있지?");
		System.out.println("저녁 뭐 먹지");

		// .printf : 형식을 지정하면서 콘솔창에 출력
		// ("형식", 데이터) 소숫점 한 자리만 표시하는 형식
		System.out.printf("%.1f", 45.123);
		System.out.println(); // 줄 바꾸기 위해 써놓음
		
		
		////////// \ 역 슬래쉬 특집
		
		// 학원 올 때 뭐 타고 왔는지 출력
		//  \는 특정한 사용처가 있고, 이 외에 사용하면 깨진다.
		// 특수문자 중 \n <- 줄 바꿈
		//		\n - new line
		//		\r - carriage return : 줄 바꾸고 커서를 맨 앞으로
		// tab키의 기능은 단순히 띄어쓰기가 아니라 정해진 tab 키 포인트로 가는 것이 탭이다.
		//		\r\n - 완성된 줄바꿈
		//		\t - tab
		//		\b - backspace (1byte 지우기) java에서는 글자 하나를 표현하는 데에 2byte를 사용함
		// 역슬래쉬 \\ -> 글자 하나 \로 쳐준다.
		// 역슬래쉬 따옴표 = 따옴표 하나
		
		System.out.println("비대면 강의 듣는 날입니다.");
		System.out.println("\2000");
		System.out.println("ㅋㅋ\nㅎㅎ");
		System.out.println("ㅋㅋ\rㅎㅎ");
		System.out.println("ㅋ\tㅎ");
		System.out.println("ㅋㅋㅋ\b");
		System.out.println("\\2000");
		System.out.println("\"");
		
	}
}

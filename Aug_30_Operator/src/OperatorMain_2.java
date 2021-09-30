import java.util.Scanner;

// 대부분 2항 연산
//		a > 2
// 		1 + 2

// 1항(단항) 연산
//		!d

// 3항 연산
// 		조건식 ? O일 때 값 : X일 때 값

public class OperatorMain_2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = k.next();
		
		System.out.print("나이 : ");
		int age = k.nextInt();
		
		// 나이가 짝수면 짝, 홀수면 홀
		String jakhole = (age % 2 == 0) ? "짝" : "홀";
		System.out.println(jakhole);
		
		// 나이가 20살 이상이면 안녕하세요, 아니면 나가
		String say = (age >= 20) ? "안녕하세요" : "나가";
		System.out.println(say);
		
		// if를 사용할 때보다 소스가 짧아져서 효율적.
		
		// 이름이 홍길동이면 어...야, 아니면 어서오세요
		// String say2 = (name == "홍길동") ? "어...야" : "어서오세요";
		// System.out.println(say2);
		// 위 소스가 왜 안 되는가?
		
		// 연산자라는 것들은 stack영역이 대상이다. 
		// 메모리 영역 중에는 stack영역, heap영역이 있다. 그런데 'String'은 참조형, 
		// String 사용 시 heap영역에 저장되고, stack영역에는 '번지수'만 저장된다. 
		// 따라서 == 연산자를 사용할 수 없는 것이다. 
		
		// 글자가 똑같은지 아닌지 판단하려면
		String say2 = (name.equals("홍길동")) ? "어? 야!" : "어서오세요.";
		System.out.println(say2);
	
		
} 
}
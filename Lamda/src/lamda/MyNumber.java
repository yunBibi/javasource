package lamda;

// functional interface
// 메소드 하나만 선언해야 함

@FunctionalInterface    // 하나 이상의 메소드를 실행하지 못 하도록 제한함. 이 어노테이션이 없어도 실행은 가능!
public interface MyNumber {
	int max(int num1,int num2);
	// int min(int num1,int num2);      <-- 불가능
}

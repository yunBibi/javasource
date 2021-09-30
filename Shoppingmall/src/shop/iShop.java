package shop;

// 완전추상화 <- 상수필드만 가짐, 메소드는 추상 메소드만 가짐
// jdk8이 되면서 default, static도 가능하기는 하지만
// 추상 메소드만 가지는 건 바뀌지 않았기 때문에 원칙대로 처리해준다.

public interface iShop {
	void setTitle(String title);   // 앞에 public abstract이 생략되었음
	void genUser();
	void genProduct();
	void start();
}

package inheritance;

public class ChildEx {

	public static void main(String[] args) {
		// Child 객체를 생성하는 2가지 방법
		// 1) 
		Child child = new Child(25);
		System.out.println("child age : "+ child.getAge());
		child.play();
		
		// 2) 
		Parent parent = new Child(26);
		System.out.println("child age : "+ parent.getAge());
		// parent.play();   <- 얘는 부를 수 없다.
	}

}

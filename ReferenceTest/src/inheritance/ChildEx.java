package inheritance;

public class ChildEx {

	public static void main(String[] args) {
		// Child ��ü�� �����ϴ� 2���� ���
		// 1) 
		Child child = new Child(25);
		System.out.println("child age : "+ child.getAge());
		child.play();
		
		// 2) 
		Parent parent = new Child(26);
		System.out.println("child age : "+ parent.getAge());
		// parent.play();   <- ��� �θ� �� ����.
	}

}

package classTest;

public class NumbersEx {
	public static void main(String[] args) {
		
		int num[] = {5,6,7,8};
		
		Numbers numbers = new Numbers(num);
		
		System.out.println("�հ� : "+numbers.getTotal());
		System.out.println("��� : "+numbers.getAverage());
	}
 
}

package classTest;

public class MyMathEx {
	public static void main(String[] args) {
		// static �޼ҵ�(Ŭ���� �޼ҵ�) ȣ�� => ��ü ���� ���� 
		System.out.println(MyMath.add(200L, 100L));		
		System.out.println(MyMath.subtract(200L, 100L));		
		System.out.println(MyMath.multiply(200L, 100L));		
		System.out.println(MyMath.divide(200, 100));
		
		// ����޼ҵ� ȣ��
		
		MyMath mm = new MyMath();
		
		mm.a = 200L;
		mm.b = 100L;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
	}
}

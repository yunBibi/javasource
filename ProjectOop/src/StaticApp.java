class Foo{
	public static String classVar = "I class Var";
	public String instanceVar = "I instance var";
	
	public static void classMethod() {
		System.out.println(classVar);    // OK
//		System.out.println(instanceVar); // Error
	}
	public void instanceMethod() {
		System.out.println(classVar);    // OK
		System.out.println(instanceVar); // OK
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);     // OK
//		System.out.println(Foo.instanceVar);  // Error
		Foo.classMethod();
//		Foo.instanceMethod();   // Error  Ŭ���� �޼ҵ带 ���ؼ� �ν��Ͻ��� �����ϴ� ���� �����Ǿ� �ִ�. 
		
		Foo f1 = new Foo();
		
		
		
	}
}

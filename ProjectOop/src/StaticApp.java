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
//		Foo.instanceMethod();   // Error  클래스 메소드를 통해서 인스턴스에 접근하는 것은 금지되어 있다. 
		
		Foo f1 = new Foo();
		
		
		
	}
}

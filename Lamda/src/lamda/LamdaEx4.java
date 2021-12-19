package lamda;

public class LamdaEx4 {
	public static void main(String[] args) {
		LamdaTest4 obj = str -> System.out.println(str+"!!");
		obj.showString("Hello");
		
		showMyString(obj);
	}
	
	public static void showMyString(LamdaTest4 lamda) {
		lamda.showString("hello lamda");
	}
}

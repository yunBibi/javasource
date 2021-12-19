package lamda;

public class LamdaEx2 {
	public static void main(String[] args) {
		LamdaTest2 obj = x -> System.out.println(x);
		obj.methd1(10);
		
		obj = x -> System.out.println(x * x);
		obj.methd1(20);
	}

}

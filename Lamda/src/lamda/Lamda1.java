package lamda;

public class Lamda1 {
	
	int max(int a, int b) {
		return a > b ? a:b;
	}
	// (int a, int b) -> {return a > b ? a:b; }
	// (int a, int b) -> a > b ? a:b;
	// (a,b) -> a > b ? a:b;   ¶÷´Ù½Ä
	
	
	void printVar(String name, int i) {
		System.out.println(name + "=" + i);
	}
	// (String name, int i) -> {System.out.println(name + "=" + i);}
	// (String name, int i) -> System.out.println(name + "=" + i);
	// (name, i) -> System.out.println(name + "=" + i);
	
	
	int square(int x) {
		return x * x;
	}
	// (int x) -> {return x * x;}
	// (int x) -> x * x;
	// x -> x * x;
	
	int roll() {
		return (int)(Math.random() * 6);
	}
	// () -> { return (int)(Math.random() * 6);}
	// () -> (int)(Math.randeom() * 6);
}

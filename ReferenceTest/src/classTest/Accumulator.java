package classTest;

public class Accumulator {
	static {
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	int total = 0;
	static int grandTotal = 0;
	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
	
	static void print() {
		// total
	}
}

class Accounting {
	public double valueOfSupply;
	public static double vatRate = 0.1;   // 유지보수를 위해 그대로 클래스 변수로서 사용한다.

	public double getVAT() {
		return valueOfSupply * vatRate;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}
}

public class AccountingApp {
	public static void main(String[] args) {

		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 30000.0;
		
		System.out.println("Value of supply : " + a1.valueOfSupply);
		System.out.println("Value of supply : " + a2.valueOfSupply);

//    	Accounting.valueOfSupply = 10000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//        System.out.println("VAT : " + Accounting.getVAT());
//        System.out.println("Total : " + Accounting.getTotal());

	}

}
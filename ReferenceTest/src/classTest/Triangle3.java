package classTest;
public class Triangle3 {
	
	// private���� ���ߴ� �� <- ĸ��ȭ
	private double under;
	private double height;
	
	// ������ 
	Triangle3(double under, double height){
		this.under = under;
		this.height = height;
	}
	
	double triA (double x, double y) {
		return (under * height /2);
	}
	
}

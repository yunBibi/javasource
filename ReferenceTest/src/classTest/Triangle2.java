package classTest;
public class Triangle2 {
	
	// private으로 감추는 것 <- 캡슐화
	private double under;
	private double height;
	
	// 생성자 
	Triangle2(double under, double height){
		this.under = under;
		this.height = height;
	}
	
	double triA (double x, double y) {
		return (under * height /2);
	}
	
}

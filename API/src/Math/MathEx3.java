package Math;

// java.lang ��Ű���� �⺻������ import�� �Ǿ� ����

// �ϳ��� Ŭ������ ��� �޼ҵ尡 static �޷ε�� �����Ǿ� �ִٸ�
// import static�� ���� ��� ����

import static java.lang.Math.*;    // <- ��� �޼ҵ尡 static�̱� ������ ����

public class MathEx3 {
	public static void main(String[] args) {
		double val = 90.7552;
		
		// MathEx1�� �޸� �տ� Math.�� ������ �ʾƵ� ��� �����ϴ�.
		System.out.println("round() "+round(val));
		System.out.println("ceil() "+ceil(1.1));
		System.out.println("floor() "+floor(1.5));
		System.out.println("max() "+max(1.5, 1.2));
		System.out.println("min() "+min(1.5, 1.2));
	}

}

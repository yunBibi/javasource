import java.util.Scanner;

public class LastWeekMain {
	public static void main(String[] args) {
		// 예제1
		// 키보드 입력받을 준비해서 k에 저장함
		Scanner k = new Scanner(System.in);

		System.out.println("---편의점 택배---");

		System.out.print("가로 : ");
		double karo = k.nextDouble();

		System.out.print("세로 : ");
		double sero = k.nextDouble();

		System.out.print("높이 : ");
		double height = k.nextDouble();

		System.out.print("무게 : ");
		double weight = k.nextDouble();

		System.out.println("---------------");

		// 선생님 코드
		double v = karo * sero * height;
		System.out.printf("부피 : %.1f\n", v);
		System.out.printf("무게 : %.1f\n", weight);

		// 내 코드
		System.out.println("부피(가*세*높) : " + karo * sero * height);
		System.out.println("무게 : " + weight);

		// 예제2
		// 부피가 10이상이고, 무게가 1000이상이면 a이용 가능
		boolean a = v >= 10 && weight >= 1000;
		System.out.println(a);

		// 부피가 10미만이거나, 무게가 1톤 미만이면 b이용 가능
		boolean b = v < 10 || weight < 1000;
		System.out.println(b);

		// 무게가 20이상이고, 무게가 30이상이면
		boolean c = weight >= 20 && weight >= 30;
		System.out.println(c);

		// &&와 ||는 한 개씩만 써도 결과가 나오지만 두 개를 쓰는 것이 좋다.
		// &&, || : 앞 항에서 결과가 나오면 연산 중지
		// &, | : 앞 항에서 결과가 나와도 끝 항까지 연산

		// 연산 과정을 단축시켜주려면 이 성질을 활용하면 좋다.
		/*
		 * &&를 사용하면서 true일 확률이 낮은 항을 앞으로 보내면 두 번 검사할 것을 한 번만 검사하면 된다. 마찬가지로, ||를 사용할 때
		 * true일 확률이 높은 항을 앞으로 보내면 연산을 단축할 수 있다.
		 */

		// 따라서 위와 같은 경우 앞 항과 뒤 항의 순서를 바꿔주면 좋다.

		// 부피가 10미만이든지, 무게가 1000미만이든지 하나만
		// XOR(eXclusive OR) - 배타적 or
		// ^ <- 이건 ^^ 두 개 연산자가 있을 수 없다.
		// exclusive or을 수행하려면 무조건 두 항을 모두 검토해야 하기 때문
		boolean d = (v < 10) ^ ( weight < 1000);
		System.out.println(d);

	}
}
package lamda;

import java.util.ArrayList;
import java.util.List;

public class TravelEx1 {
	public static void main(String[] args) {
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		customerList.add(new TravelCustomer("이순신", 40, 1000000));
		customerList.add(new TravelCustomer("김유신", 30, 1200000));
		customerList.add(new TravelCustomer("홍길동", 25, 7000000));
		customerList.add(new TravelCustomer("성춘향", 38, 1300000));
		customerList.add(new TravelCustomer("강감찬", 50, 1000000));
		
		// 고객 명단 출력하기(이름만)
		customerList.stream().map(TravelCustomer::getName).forEach(System.out::println);
		
		System.out.println();
		
		// 고객들의 총 여행 비용 출력하기
		System.out.println("총 여행비용 " + customerList.stream().mapToInt(c -> c.getPrice()).sum());
		
		System.out.println();
		
		// 30세 이상 고객 명단 출력하기
		customerList.stream()
		            .filter(c -> c.getAge() >=30)
		            .map(TravelCustomer::getName)
		            .sorted()
		            .forEach(System.out::println);
		         
		
	}

}

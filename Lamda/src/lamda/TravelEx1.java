package lamda;

import java.util.ArrayList;
import java.util.List;

public class TravelEx1 {
	public static void main(String[] args) {
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		customerList.add(new TravelCustomer("�̼���", 40, 1000000));
		customerList.add(new TravelCustomer("������", 30, 1200000));
		customerList.add(new TravelCustomer("ȫ�浿", 25, 7000000));
		customerList.add(new TravelCustomer("������", 38, 1300000));
		customerList.add(new TravelCustomer("������", 50, 1000000));
		
		// �� ��� ����ϱ�(�̸���)
		customerList.stream().map(TravelCustomer::getName).forEach(System.out::println);
		
		System.out.println();
		
		// ������ �� ���� ��� ����ϱ�
		System.out.println("�� ������ " + customerList.stream().mapToInt(c -> c.getPrice()).sum());
		
		System.out.println();
		
		// 30�� �̻� �� ��� ����ϱ�
		customerList.stream()
		            .filter(c -> c.getAge() >=30)
		            .map(TravelCustomer::getName)
		            .sorted()
		            .forEach(System.out::println);
		         
		
	}

}

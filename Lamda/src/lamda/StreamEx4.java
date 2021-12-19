package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx4 {
	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		
		stuList.add(new  Student("ȫ�浿",40));
		stuList.add(new  Student("���¿�",90));
		stuList.add(new  Student("������",50));
		stuList.add(new  Student("����ȣ",80));
		
		// �达�� ��� ã�Ƽ� ���
		stuList.stream().filter(s -> s.getName().startsWith("��")).forEach(name -> System.out.println(name.getName()));
	
		// map + filter + forEach
		stuList.stream()
			   .map(stu -> stu.getName())
			   .filter(stu -> stu.startsWith("��"))
			   .forEach(System.out::println); 
		
		IntStream intStream = IntStream.range(1, 10);
		// ¦���� ���
		intStream.filter(i -> i%2 == 0).forEach(System.out::println);
		
		
		
		
	
	}
}

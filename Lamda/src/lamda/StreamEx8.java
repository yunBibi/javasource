package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx8 {
	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		
		stuList.add(new  Student("ȫ�浿",40));
		stuList.add(new  Student("���¿�",90));
		stuList.add(new  Student("������",50));
		stuList.add(new  Student("����ȣ",80));
		
		// �� student ��ü �ȿ� �ִ� ������ ����Ʈ�� �����ޱ�
		List<Integer> stuJumsu = new ArrayList<Integer>();
		for(Student s:stuList) {
			stuJumsu.add(s.getJumsu());
		}
		for(Integer i:stuJumsu) {
			System.out.println(i);
		}
		
		List<Integer> intList =stuList.stream().map(Student::getJumsu).collect(Collectors.toList());
		System.out.println(intList);
	}

}

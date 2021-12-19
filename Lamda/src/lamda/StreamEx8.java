package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx8 {
	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		
		stuList.add(new  Student("홍길동",40));
		stuList.add(new  Student("김태우",90));
		stuList.add(new  Student("송종국",50));
		stuList.add(new  Student("김윤호",80));
		
		// 각 student 객체 안에 있는 점수만 리스트로 돌려받기
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

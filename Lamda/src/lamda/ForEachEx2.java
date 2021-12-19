package lamda;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx2 {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		
		stuList.add(new  Student("È«±æµ¿",40));
		stuList.add(new  Student("±èÅÂ¿ì",90));
		stuList.add(new  Student("¼ÛÁ¾±¹",50));
		stuList.add(new  Student("±èÀ±È£",80));
		
		// È«±æµ¿ : 40
		for(Student student : stuList) {
			System.out.println(student.getName()+" : "+student.getJumsu());
		}
		
		stuList.forEach(student -> System.out.println(student.getName()+" : "+student.getJumsu()));
	}

}

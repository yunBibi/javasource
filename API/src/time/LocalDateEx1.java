package time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;    // java.lang을 벗어났기 때문에 import구문이 들어온다.

public class LocalDateEx1 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf.format(date));
	
		LocalDate currDate = LocalDate.now();
		System.out.println(currDate);
		
		LocalTime currTime = LocalTime.now();
		System.out.println(currTime);
		
		LocalDateTime currDateTime  = LocalDateTime.now();
		System.out.println(currDateTime);
		
	}

}

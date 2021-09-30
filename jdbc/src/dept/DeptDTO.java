package dept;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 테이블 결과랑 똑같은 모양으로 작성

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class DeptDTO {
	private int deptNo;
	private String dname;
	private String loc;
	
}

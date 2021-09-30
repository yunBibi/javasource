// 주석(comment) <- 컴파일 때 제외된다. 자바 문법과 상관 없이 적어도 된다. 

/*
 * 여러줄 주석
 * 전부 주석 범위이다. 
 * 혹은 코드 중간에 주석을 넣을 때에도 활용 가능하다. 
 *  => 범위 지정 주석이라고 보면 됨
 */

/**
 * 메뉴얼 만들 때 사용하는 주석
 * 
 * @author hp87
 *
 */

// ctrl + /: 주석으로 처리할 수 있는 단축키(주석을 해제할 수도 있음)
// ctrl + shift + / : 블록 지정 후 사용 시, 범위 주석처리 가능함
// ctrl + f11 : 실행
// ctrl + shift + +/- (numpad) : 글자크기 조절
// ctrl + shift + f : 소스를 정리해주는 무적의 단축키  (가독성 좋게 소스 정리)
// ctrl + alt + 위/아래 : 줄 복사
// ctrl + d : 줄 전체 삭제

// alt + 위/아래 : 위치 줄 이동

// ; - semi-colo 한 문장이 끝났음을 표시함
// : - colon 콜론
// \ - back slash : 원(won달러) 표시
// | - pipi/bar : 붙어서 나올 수도 있는데 이는 폰트 차이이다.

public class Test2 {
	// main, ctrl+space
	public static void main(String[] args) throws InterruptedException {
		// syso, ctrl+space
		System.out.println("수업 중"); // 콘솔창에 출력할 때 사용
		System.out.println("수업 중");
		System.out.println("수업 중");
	
		Thread.sleep(5000); // 프로그램을 잠깐 멈추는 코드 (1000=1초)
	}

}

// 우클릭 -> 내보내기(exprot) 
// .jar : Java Archive 기계어 상태로 된 걸 압축해놓은 자바 압축파일
// 실행시키는 법 : 메모장에 java -jar  test2.jar -> 다른 이름으로 저장(.bat 확장자 & 모든파일)

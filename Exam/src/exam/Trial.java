package exam;

public class Trial {
	public static void main(String[] args) {
		int score[] = {78,65,95,88,36,45,25,47,87,43};
		
		// 최대값 최소값
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			} else if(min > score[i]){
				min = score[i];
			}
		} System.out.printf("%d, %d", max, min);
	}

}


public class ForTest5 {
	public static void main(String[] args) {
		// **********
		// **********
		// **********
		// **********
		// **********
		// ��� ���� ���� 2���� ����� for�� ������
		
		
		// ���� for ���� ����
		// (1) int i=0;
		// (2) i <3;
		// (3) ���� for���� int j=0;
		// (4) j<3;
		// (5) System.out.print("*");   => *
		// (6) j++ => j=1
		// (7) j<3;
		// (8) System.out.print("*");   => **
		// (9) j++  => j=2
		// (10) j<3;
		// (11) System.out.print("*");  => ***
		// (12) j++  => j=3
		// (13) j<3;  => ���� for�� ����
		// (14) System.out.println();
		
		// (1) i++l i=2
		// (2) i<3;
		// (3) ���� for���� int j=0; ~~~ (14) ����
		// ***
		// ***
		
		// (1) i++, i=3
		// (2) i<3;  => �ٱ� for�� ����
		
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
			System.out.print("*");
			}
			System.out.println();  
		}
		
		
		for(int i=0; i<6; i++) {
			for (int j=0; j<11; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
package classTest;

public class ArrayTest5 {
	public static void main(String[] args) {
		// ���� => char / 'a' 
		// ���ڿ� => String / "a"
		
		// char �迭 ����, ����, �ʱ�ȭ
		char chArr[] = {'a','n','s','w','e','r'};
		char[] chArr2 = {'a','n','s','w','e','r'};   // ���ȣ�� ��ġ�� ����� ����. 
		
		for(char ch:chArr) {
			System.out.print(ch);
		}
	}
}

package string;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		String str1 = "Hello Java!!";

		// String ���·� �ΰ� �Ųٷ� ���
		char[] chArr = str1.toCharArray();
		for (int i = chArr.length-1; i >= 0; i--) {
			System.out.print(chArr[i]+" ");
		}
		
			System.out.println();
			
			// StringBuilder���� �Ųٷ� ���
			StringBuilder builder = new StringBuilder(str1);
			System.out.println(builder.reverse());
	}

	}


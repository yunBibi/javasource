package stringtokenizer;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String text = "È«±æµ¿/¼ºÃáÇâ/¹Ú¿¬¼ö/ÀÌ¼öÈ«";
		
		String[] names = text.split("/");
		for(String s:names) {
			System.out.println(s);
		} 
		System.out.println();
		 
		StringTokenizer st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}

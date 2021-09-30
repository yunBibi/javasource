package inheritance;

public class CaptionTv2 extends TV2 {

	boolean caption;
	
	public CaptionTv2(String color, boolean power, int channel) {
		super(color, power, channel);
	}

	
	void displayCaption(String text) {
		if (caption) {  // caption == true
			System.out.println(text);
		}
	}
}
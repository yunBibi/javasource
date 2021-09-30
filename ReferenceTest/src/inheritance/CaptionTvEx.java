package inheritance;

public class CaptionTvEx {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;
		ctv.channelUp();
		
		System.out.println("현재 채널 : "+ctv.channel);
		
		ctv.displayCaption("Hello World");
		ctv.caption = true;
		ctv.displayCaption("Hello Java");
	}
}

package inheritance;

public class CaptionTvEx2 {
	public static void main(String[] args) {
		CaptionTv2 ctv = new CaptionTv2("black",true,8);
		
//		ctv.channel = 10;
		ctv.channelUp();
		
		System.out.println("현재 채널 : "+ ctv.getChannel());
		
		ctv.displayCaption("Hello World");
		ctv.caption = true;
		ctv.displayCaption("Hello Java");
	}
}

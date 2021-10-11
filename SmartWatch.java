package inheritance;

public class SmartWatch extends Watch{
	static String Sleepscore = "90" ;
	public static void main(String[]args) {
		SmartWatch watch = new SmartWatch();
		//System.out.println(watch.Time);
		//System.out.println(watch.Date);
		System.out.println("SleepScore is " + Sleepscore);
		watch.Display();
		
	}

}

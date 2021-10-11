package methodOverLoading;

public class Adder {
	static int add(int a, int b) {
		return a+b;
	}
		static double add(double c, double d, double f) {
			return c-d-f;
		}
		
public static void main(String[]args) {
	System.out.println(Adder.add(1, 8));
	System.out.println(Adder.add( 145.987, 89 , 7));
}

}

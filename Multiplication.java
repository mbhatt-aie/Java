package methodOverLoading;

public class Multiplication {
	static int Multiply(int a, int b)
	{
		return a*b;
	}
	static double Multiply(double a, double b)
	{
		return a*b;
	}

public static void main(String[]args) {
	System.out.println(Multiplication.Multiply(9, 8));
	System.out.println(Multiplication.Multiply(5.5 , 5.6));
}
}

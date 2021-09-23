import java.util.Scanner;
public class If_Example {
public static void main(String[]args) {
	
		Scanner S = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		System.out.println("Enter the age: ");
		int marks = S.nextInt();
		int age = sc.nextInt();
		if (marks>=35 && age>=18)
		{
		System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
			
		}
	}
}

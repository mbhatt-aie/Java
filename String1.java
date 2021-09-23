import java.util.*;
public class String1 {
	public static void main(String[]args)
	{
		String s1 = "Good "; //Don't forget the white space
		String s2 = "Morning";
		String s4 = "";
		String s3 = s1+s2;
		
		
		System.out.println(s3);
		
		System.out.printf ("Length of string s1 is:\n"+ s1.length()+'\n');
		System.out.printf("Length of string s2 is:\n" + s2.length()+'\n');
		System.out.printf("Length of string s3 is:\n" + s3.length()+'\n');
		System.out.printf("Length of string s4 is:\n" + s4.isEmpty() +'\n');
		
	}

}

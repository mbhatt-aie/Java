package inheritance;

public class ComputerScienceTeacher extends Teacher {
		   String mainSubject = "Computer Science";
		   public static void main(String args[]){
			   ComputerScienceTeacher obj = new ComputerScienceTeacher();
			System.out.println(obj.collegeName);
			System.out.println(obj.designation);
			System.out.println(obj.mainSubject);
			obj.does();
		   }
		}


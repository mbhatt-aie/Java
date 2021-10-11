	// A method which is declared as abstract and does not have implementation is known as an abstract method.
	//implementation is provided by another class
package abstraction;

abstract class House {
		abstract void house();                                      //abstract method
	}
 	public class Home extends House{
		void house()
		{
		System.out.println("This house is mine");
		}
		public static void main(String[]args) {
			House ah = new Home();//in abstract class cannot instantiate the object//creating object of home with house as reference
			//Home home = new home()
			ah.house();
		}
	}

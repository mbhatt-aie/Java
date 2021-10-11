	// A method which is declared as abstract and does not have implementation is known as an abstract method.
	//implementation is provided by another class
package abstraction;

abstract class AbstractHouse {
		abstract void house();                                      //abstract method
	}
	class Home extends AbstractHouse{
		void house()
		{
		System.out.println("This house is mine");
		}
		public static void main(String[]args) {
			AbstractHouse ah = new Home();
			ah.house();
		}

	
	}

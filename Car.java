//primitive variables are directly used for call by value
//objects use call by reference

package methodOverRiding;
public class Car  extends Vehicle{
	void automobile()
	{
		System.out.println("CAR is running safely");	
	}
	public static void main(String args[]) {
		Car c = new Car();//creating a car object with car class as reference                                         
		//Vehicle v = new Car(); //car object with vehicle class as reference to access all variable but not method of car class
		//Vehicle v1 = new Vehicle();//creating an object of class Vehicle
		c.automobile();//invoking the automobile method
	}
}

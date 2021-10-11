package inheritance;

public class Mobile extends Telephone{
			String Message = "Messaging";
			public static void main(String[]args) {
				Mobile mob = new Mobile();
				mob.Call();
				System.out.println(mob.Call);
				System.out.println(mob.Message);
				
			}

}

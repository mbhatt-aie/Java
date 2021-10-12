//switch statement executes one statement from multiple conditions.
public class SwitchExample { 
		public static void main(String[] args) {  
		   int number=40;//Declaring a variable for switch expression  
		    switch(number){  //Switch expression  
		    case 10: System.out.println("10");   //Case statements   
		    break;  
		    case 20: System.out.println("20");  
		    break;  
		    case 30: System.out.println("30");  
		    break;  
		    default:System.out.println("Not in 10, 20 or 30");  //Default case statement  
		    /*The default statement is optional and can appear anywhere inside the switch block. In case, 
		   if it is not at the end, then a break statement must be kept after the default statement to omit the execution of the next case statement.*/
		    }  
		}  

}

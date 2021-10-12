////The Java do-while loop is used to iterate a part of the program repeatedly, until the specified condition is true.Syntax:
/*
do{    
//code to be executed / loop body  
//update statement   
}while (condition);    
*/
package loops;
public class DoWhileExample {
	public static void main(String[] args) {    
	    int i=1;    
	    do{    
	        System.out.println(i);    
	    i++;    
	    }while(i<=10);    
	}

}

/*The for-each loop is used to traverse array or collection in Java. 
It works on the basis of elements and not the index. It returns element one by one in the defined variable.
Syntax of forEach
for(data_type variable : array_name){    
//code to be executed    
}    
*/
package loops;
public class ForEachExample {
	public static void main(String[] args) {  
	    int arr[]={12,23,44,56,78};  
	    for(int i:arr){  
	        System.out.println(i);  
	    }  
	}  

}

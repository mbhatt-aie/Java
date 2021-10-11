package methodOverLoading;

public class Calculate {
	 void sum(int a,int b){
		 System.out.println("Int arg method invoked");
		 }  
	  void sum(long a,long b){
		  System.out.println("Long arg method invoked");
		  }  

public static void main(String args[]){  
	  Calculate  c = new Calculate();  
	  //c.sum( 9223304L , 9223304L); //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	  c.sum(92233,92233);//-2,147,483,648 to 2,147,483,647
	  }  
	}  
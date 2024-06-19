package controlFlowstatement;

public class PrimeNumberForLoop {

	public static void main(String[] args) {
      int number= 7;
      boolean flag = true;
      for(int i=2;i<number;i++) {
    	  if(number%2==0) {
    		  flag = false;
    		  break;
    	  }
      }
      if(flag) {
    	  System.out.println("number is a prime number");
      }
      else {
    	  System.out.println("number is not a prime number");
    	  
      }
	
	}
	

}

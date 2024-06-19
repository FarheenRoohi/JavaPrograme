package controlFlowstatement;

public class ReverseTheNumberWhileLoop {

	public static void main(String[] args) {
      int number=123456;
      int reversenumber=0;
      int i=1;
      while(number>0) {
    	  reversenumber=number%10;
    	  System.out.print(reversenumber);
    	  number/=10;
    	  i++;
      }
	}

}

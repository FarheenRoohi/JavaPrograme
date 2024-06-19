package controlFlowstatement;

public class primeNumberWhileLoop {

	public static void main(String[] args) {
         int number = 7;
         boolean flag=true;
         int i = 2;
         while(number<6) {
        	 if(number%i==0) {
        		 flag=false;
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

package controlFlowstatement;

public class ReversetheNumberForloop {

	public static void main(String[] args) {
       int number=12345;
       int reverse=0;
       for(int i=1;number>0;i++) {
       reverse=number%10;
       System.out.print(reverse);
       number/=10;
      
       }
       
	}

}

package controlFlowstatement;

public class FactorialReusableMethod {
      
	public static void main(String[] args) {
		FactorialReusableMethod fm = new FactorialReusableMethod();
		int result=fm.factorial(5);
		System.out.println(result);
		//System.out.println(fm.factorial(5));
		
	}
	  int facto= 1;
     int factorial(int number) {
    	 for(int i = 1;i<=number;i++) {
    		 facto*=i;
    	 }
		return facto;
		
     }
}

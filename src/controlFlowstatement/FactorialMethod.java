package controlFlowstatement;

public class FactorialMethod {

	public static void main(String[] args) {
		FactorialMethod fm = new FactorialMethod();
		int result =fm.factorial(4);
		System.out.println(result);
		
	}
	
	int facto =1;
	int factorial(int number) {
		for(int i = 1;i<=number;i++) {
			facto*=i;
		}
		return facto;
		
		
	}

}

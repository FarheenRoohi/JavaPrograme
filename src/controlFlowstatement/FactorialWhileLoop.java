package controlFlowstatement;

public class FactorialWhileLoop {

	public static void main(String[] args) {
		FactorialWhileLoop f = new FactorialWhileLoop();
		int reserve =f.factoria(5);
		System.out.println(" = "+reserve);
	}
	int facto=1;
	int factoria(int number) {
	int i= 1;
	while(i<=5) {
		facto*=i;
		System.out.print(i+"*");
		i++;
	}
	
	return facto;
	}
}

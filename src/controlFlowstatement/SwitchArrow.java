package controlFlowstatement;

public class SwitchArrow {

	public static void main(String[] args) {
		int key = 3;
		switch (key) {
		case 1 -> System.out.println("This is case 1") ;       
//		System.out.println("This is a Case1");
		case 2 -> System.out.println("case2");
		
		default ->
		System.out.println("Default");
		}
	}

}

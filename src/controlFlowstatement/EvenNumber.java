package controlFlowstatement;

public class EvenNumber {

	public static void main(String[] args) {
		int number = 20;
		//System.out.println(number / 2);
		for (int i = 0; i <=number; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	
}

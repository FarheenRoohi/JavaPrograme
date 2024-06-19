package controlFlowstatement;

public class ForLoopPattern3 {

	public static void main(String[] args) {
		int totalRow = 8;
		for (int row = 1; row <= totalRow; row++) {
			for (int space = 1; space <= totalRow - row; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= row; star++) {
				System.out.print("* ");
			} 
			System.out.println();
		}
	}
}

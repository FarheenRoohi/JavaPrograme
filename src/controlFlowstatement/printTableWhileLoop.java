package controlFlowstatement;

public class printTableWhileLoop {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%4d", i * j);
			}
			i++;
			System.out.println();
		}

	}

}

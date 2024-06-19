
public class DiamondPattern {

	public static void main(String[] args) {
		int totalRow = 8;
		for (int row = 1; row <= totalRow; row++) {
			for (int space = 1; space <= totalRow - row; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= row; star++) {
				System.out.print("* ");
			}
			for (int r = 1; r <= totalRow; r++) {
				for (int str = 1; str <= totalRow - r + 1; str++) {
					System.out.print("* ");
				}
				int str = 1;
				for (int sp = 1; sp <= totalRow - r + 1; sp++) {
					System.out.print(" ");
				}System.out.println();
			}
		}
	}

}

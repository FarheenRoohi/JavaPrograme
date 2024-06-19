
public class DiamondPattern2 {

	public static void main(String[] args) {
		int totalRow = 5;
		for (int row = 1; row <= 5; row++) {
			for (int sp = 1; sp <= totalRow - row; sp++) {
				System.out.print(" ");
			}
			for (int str = 1; str <= row * 2 - 1; str++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int r = 1; r <= totalRow; r++) {
			
			for (int spc = 1; spc <= r - totalRow + 4; spc++) {
				System.out.print(" ");
			}
			for (int st = 1; st <= 2*(totalRow - r)  + 1; st++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

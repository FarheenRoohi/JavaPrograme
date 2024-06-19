package ArrayInJava;

public class ArraySmallNumber {

	public static void main(String[] args) {
		int a[] = { 4, 7, 10, 60, 100, 3, 80, 1 };
		int smallNumber = a[0];
		for (int i = 1; i < a.length; i++) {
			if (smallNumber > a[i]) {
				smallNumber = a[i];
			}

		}
		System.out.println(smallNumber);

	}

}

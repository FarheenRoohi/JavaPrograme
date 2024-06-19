package ArrayInJava;

public class SortedArrayAssendingOrder {

	public static void main(String[] args) {
		int a[] = { 20, 60, 40, 2, 8 };

		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			// original Array
			System.out.print(a[i] + " ,");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[j] <a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}
		System.out.println();

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ,");
		}
	}

}

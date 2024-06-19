package ArrayInJava;

public class LargerNumber {

	public static void main(String[] args) {
		int a[] = { 50, 60, 59, 80, 55 };
		int largerNumber = a[0];
		for (int element : a) {

			if (largerNumber < element) {
				largerNumber = element;
			}
		}
		System.out.println(largerNumber);

	}

}

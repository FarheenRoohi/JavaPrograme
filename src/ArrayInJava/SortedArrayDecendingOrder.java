package ArrayInJava;

public class SortedArrayDecendingOrder {

	public static void main(String[] args) {
     int a[]= {30,31,60,50,100};
     int temp=0;
     System.out.println("Before  ");
     for(int i=0;i<a.length;i++) {
     System.out.print(a[i]+" ");
	}
     
     for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[j] >a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}
     System.out.println();
     System.out.println("After  ");
     for(int i=0;i<a.length;i++) {
         System.out.print(a[i]+" ");
    	}
	}
}

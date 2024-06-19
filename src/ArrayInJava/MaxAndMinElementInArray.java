package ArrayInJava;

public class MaxAndMinElementInArray {

	public static void main(String[] args) {
		MaxAndMinElementInArray me = new MaxAndMinElementInArray();
		System.out.println("Max Number =" +me.maxNumber());
		System.out.println("Mini Number = "+me.minNumber());
	}
	int maxNumber() {
  int a[]= {2,5,7,9,10};
  int max = a[0];
  for(int i=1;i<a.length;i++) {
	  if(max<a[i]) {
		  max=a[i];
		  
	  }
  }return max;
 }
	int minNumber() {
		int b[]= {9,5,7,9,10};
		int minimium =b[0] ;
		for(int i=1;i<b.length;i++) {
			if(minimium>b[i]) {
				minimium=b[i];
				
			}
		}return minimium;
	}
}

package ArrayInJava;

public class AverageElementReturnmethod {

	public static void main(String[] args) {
		AverageElementReturnmethod ae = new AverageElementReturnmethod();
	    
	    System.out.println(ae.averagElement());
	}
   int averagElement() {
	   int temp =0;
	   int average=0;
	   int a[]= {10,20,30,};
	   for(int i=0;i<a.length;i++) {
	   temp+=a[i];
	   average=temp/a.length;
	   }
	  
	   return average;
   }
}

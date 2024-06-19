package ArrayInJava;

public class SumOfArray {

	public static void main(String[] args) {
     
     SumOfArray sa = new SumOfArray();
     int temp =sa.aray(a);
     System.out.println(temp);
	
	}
	static int a[] = {1,4,6,8,9};
    int sum=0;
    int aray(int a[]) {
    for(int i =0;i<a.length;i++) {
   	 
   	 sum+=a[i];
           
        }
	return sum; 
	}

}
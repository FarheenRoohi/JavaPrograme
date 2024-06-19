package ArrayInJava;

public class ReverseTheArray {

	public static void main(String[] args) {
		ReverseTheArray ra = new ReverseTheArray();
		System.out.println(ra.reverseArray());
	}

	int reverseArray(){
		int a[] = { 6, 9, 4, 7, 3 };
		int temp = 0;
		for (int i = 0; a.length>0;i++){
		int number=a.length%10;
			System.out.print(temp);			
			temp=number/10;
        System.out.print(temp);
				
		}
		return temp;
	}

}

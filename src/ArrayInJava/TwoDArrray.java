package ArrayInJava;

public class TwoDArrray {

	public static void main(String[] args) {
        int a[][] = {{10,20,30},{40,50,60},{80,90,100,50,70}};
        System.out.println(a[0].length);
        System.out.println(a[1].length);
        System.out.println(a[2].length);
        for(int i =0;i<a.length;i++) {
        	for(int j=0; j<a[i].length;j++) {
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}

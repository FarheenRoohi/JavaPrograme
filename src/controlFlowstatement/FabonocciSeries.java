package controlFlowstatement;

public class FabonocciSeries {

	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13 21 34
		int n1 = 0;
		int n2 = 1;
		int next = 0;
		System.out.print(n1+" "+n2+" ");
		for (int i = 1; i <= 10; i++) {
			next = n1 + n2;
			System.out.print(next+" ");
			n1 = n2;
			n2=next;
		}
		
	}
	

}

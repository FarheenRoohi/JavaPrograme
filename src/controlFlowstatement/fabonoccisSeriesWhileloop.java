package controlFlowstatement;

public class fabonoccisSeriesWhileloop {

	public static void main(String[] args) {
         int n1=0;
         int n2=1;
         int next=0;
         int i=1;
         while(i<=10) {
        	 next=n1+n2;
        	 System.out.print(next+" ");
        	 n1=n2;
        	 n2=next;
        	 i++;
         }
	}

}

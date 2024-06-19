package controlFlowstatement;

public class ForLoopPattern1 {

	public static void main(String[] args) {
         int totalRow = 5;
         for(int row=1; row <= totalRow;row++) {
        	 for(int star = 1;star <=totalRow - row+1;star++) {
        		 System.out.print("* ");
        		 }
        	 System.out.println();
         }
		 
	}

}

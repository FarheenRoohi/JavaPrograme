package controlFlowstatement;

public class ForloopPattern2 {

	public static void main(String[] args) {
         int totalRow = 5;
         for(int row=1;row<=totalRow;row++) {
        	 for(int star =1;star <= row;star++) {
        		 System.out.print("* ");
        	 }
        	 System.out.println();
        	 
         }
	}

}

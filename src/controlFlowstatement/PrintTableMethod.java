package controlFlowstatement;

public class PrintTableMethod {

	public static void main(String[] args) {
		PrintTableMethod pm= new PrintTableMethod();
		System.out.println(pm.printTable(10));
		
	}
	
     int printTable(int number) {
    	 for(int i=1;i<=number;i++) {
    		 for(int j= 1;j<=number;j++) {
    			 System.out.printf("%4d",i*j);
    		 }
    		 System.out.println();
    	 }
		return number;
		
		
    	 
     }
}

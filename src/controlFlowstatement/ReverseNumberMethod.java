package controlFlowstatement;

public class ReverseNumberMethod {

	public static void main(String[] args) {
		ReverseNumberMethod rn = new ReverseNumberMethod();
		
		int temp=rn.reverseMethod(6);
		System.out.println(temp);
	}
	int num = 123456;
    int reserve = 0;
	int reverseMethod(int number) {
//     int num = 123456;
//     int reserve = 0;
      reserve =num%10;
     for(int i = 1;i>0;i++) {
    	 reserve =num%10;
    	 System.out.println(i);
    	 num=num/10;
    	//num/=10;
    	 
    	 
     }
	
	return reserve;
    
  
	}
  
}

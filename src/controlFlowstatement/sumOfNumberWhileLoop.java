package controlFlowstatement;

public class sumOfNumberWhileLoop {

	public static void main(String[] args) {
        int number=123456;
        int sum=0;
        int i=1;
        while(number>0) {
        	sum+=number%10;
        	number/=10;
        	//System.out.println(sum);
        	i++;
        }System.out.println(sum);
	}

}

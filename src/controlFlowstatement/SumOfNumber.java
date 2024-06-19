package controlFlowstatement;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SumOfNumber {

	public static void main(String[] args) {
         int number= 123456;
         int sum= 0;
         for(int i=1;number>0;i++) {
        	 sum = sum+number%10;
        	 number=number/10;
        	 //or sum+=number%;
        	 //number/=10;
         }System.out.print(sum);
	}

}

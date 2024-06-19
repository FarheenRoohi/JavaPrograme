import javax.swing.plaf.synth.SynthOptionPaneUI;

public class GradingSystem {

	public static void main(String[] args) {
		 int number = 65;
      if (number>=90 && number<=100 ) {
    	  System.out.println("Result is A grade");
      }
      else if(number>=80 && number<=89) {
    	  System.out.println("Result is B grade ");
      }
      else if(number>=70 && number<=79) {
    	  System.out.println("Result is C grade");
      }
      else if(number>=60 && number<=69){
    	 System.out.println("Result is D grade");
      }
      else {
    	  System.out.println("Result is F grade");
      }
	}

}

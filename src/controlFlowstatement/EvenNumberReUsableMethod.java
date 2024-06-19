package controlFlowstatement;

public class EvenNumberReUsableMethod {

	public static void main(String[] args) {
		EvenNumberReUsableMethod en= new EvenNumberReUsableMethod();
		int reserve=en.evenNumber(20);
		System.out.println(reserve);
		//System.out.println(en.evenNumber(20));
	}
	int num=20;
	int temp;
  int evenNumber(int num) {
	  for(int i=0;i<=num;i++) {
		  if(i%2==0) {
			 System.out.println(i);
			 temp=i;
		  }
	  }
	return temp;
	  
  }
}

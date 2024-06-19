package controlFlowstatement;

public class FabonocsisSIeriesReusabbleMethod {

	public static void main(String[] args) {
		 FabonocsisSIeriesReusabbleMethod fs = new  FabonocsisSIeriesReusabbleMethod();
		int reserve= fs.fabonocci(10);
		System.out.println(reserve);

	}
	 // 0 1 1 2  3  5 8 13;
	int num1= 0;
	int num2=1;
	int next= 0;
	int fabonocci(int a) {
		System.out.print(num1+" "+num2+" ");
		for(int i=0;i<=a;i++) {
			int next=num1+num2;
			System.out.print(next+" ");
			num1=num2;
			num2=next;
		}
		return next;
		
	}

}

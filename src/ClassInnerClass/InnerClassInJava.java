package ClassInnerClass;

public class InnerClassInJava {
     void printData() {
    	 System.out.println("This is a main Class printData Method");
     }
	public static class B{
		   
		   static void getdata() {
			   System.out.println("this is inner class static Method");
		   }
	   }
	   
   
	public static void main(String[] args) {
		InnerClassInJava main = new InnerClassInJava();
		main.printData();
		//InnerClassInJava.B inner = new B.main();
		InnerClassInJava.B.getdata();
		A a = new A();
		//A.C c = new a.C(); 
		A.C c =  a.new C();
		c.getData();
	}

}
         class A{
        	 class C{
        		 void getData() {
        			 System.out.println("this is  inner class");
        		 }
        	 }
	
}
   
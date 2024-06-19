package ThidKeyWord;

public class ThisKeyWordForMethod {
           String name;
           int age;
           ThisKeyWordForMethod (String name,int age){
        	   this.name=name;
        	   this.age=age;
           }
           void printData(){
        	  setData(); 
        	  System.out.println("This is setData");
           }
           void  setData() {
        	   System.out.println("Name = "+name+ ",Age = "+age);
           }
	public static void main(String[] args) {
		ThisKeyWordForMethod m = new ThisKeyWordForMethod("Nehan", 12);
	     m.printData();
	}

}

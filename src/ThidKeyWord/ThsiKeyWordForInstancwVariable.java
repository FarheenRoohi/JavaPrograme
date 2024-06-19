package ThidKeyWord;

public class ThsiKeyWordForInstancwVariable {
             String name;
             int age;
             ThsiKeyWordForInstancwVariable(String name,int age){
            	 this.name=name+"jr";
            	 this.age=age;
             }
            	 void printinfo() {
            		 System.out.println("Name = "+name+", Age = "+age);
            		 
            	 }
             
	public static void main(String[] args) {
		ThsiKeyWordForInstancwVariable t = new ThsiKeyWordForInstancwVariable("Nubaid",14);         
          t.printinfo();
	}
  
}

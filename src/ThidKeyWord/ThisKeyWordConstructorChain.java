package ThidKeyWord;

public class ThisKeyWordConstructorChain {
         
         ThisKeyWordConstructorChain(){
        	 this(10);
       	 System.out.println("0 arg constructor");
         }
         ThisKeyWordConstructorChain(int a){
        	 this(10,20);
        	 System.out.println("1 arg constructor");
         }
         
         ThisKeyWordConstructorChain(int a, int b){
        	 this("hhh",20,30 );
        	 System.out.println("2 arg constructor");
         }
         ThisKeyWordConstructorChain(String name,int a,int b){
        	 System.out.println("3 arg constructor");
         }
         
	public static void main(String[] args) {
		ThisKeyWordConstructorChain con = new ThisKeyWordConstructorChain ();  
	     System.out.println("end");
	}

}

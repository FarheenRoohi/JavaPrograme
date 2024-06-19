
public class ConstructorInJAva {
       
	String studentName;
	int studentId;
	ConstructorInJAva(String name,int id){
		studentName=name;
		studentId=id;
		System.out.println("this is student information");
	}
     void printStudentInfo() {
    	 
    	 System.out.println("Name of student = "+studentName);
    	 System.out.println("StudentId = "+studentId);
     }
	
	public static void main(String[] args) {
		ConstructorInJAva c = new ConstructorInJAva("roohi",205);
		ConstructorInJAva b = new ConstructorInJAva("nubaid",306);
		c.printStudentInfo();
		b.printStudentInfo();
	}
     
}

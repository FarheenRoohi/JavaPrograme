package Constructor;

public class EmployeeInformation {
	String employeeName;
	int employeeId;
	String employeeHomeAddress;
	int employeePhoneNumber;

	EmployeeInformation(String EmpName, int EmpId, String EmpHomeAdd, int empPhoneNum) {
		employeeName = EmpName;
		employeeId = EmpId;
		employeeHomeAddress = EmpHomeAdd;
		employeePhoneNumber = empPhoneNum;
	}

	void printEmployeeInfo() {
		System.out.println("EmployeeName = " + employeeName + ", EmployeeId = " + employeeId
				+ ", EmployeeHomeAddress = " + employeeHomeAddress + " ,EmployeeePhineNumber = " + employeePhoneNumber);
		System.out.println("EmployeeName = " + employeeName);
		System.out.println("EmployeeId = " + employeeId);
		System.out.println("EmployeeHomeAddress = " + employeeHomeAddress);
		System.out.println("EmployeeePhineNumber = " + employeePhoneNumber);
		System.out.println();

	}

	public static void main(String[] args) {
		EmployeeInformation empInfo = new EmployeeInformation("Ruhi ,", 23593, "204 long view pkwy,", 608471945);
		empInfo.printEmployeeInfo();
	}

}

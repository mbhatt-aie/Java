package encapsulation;

class EmployeeData {
	private int empID;
    private String empName;
    private int empAge;
    
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int newValue) {
		empID = newValue;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String newValue) {
		empName = newValue;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int newValue) {
		this.empAge = newValue;
	}

}
     public class EmployeeDetails{
	public static void main(String[]args) {
		EmployeeData ed = new EmployeeData();
		ed.setEmpName("Maithreyi");
		ed.setEmpAge(22);
		ed.setEmpID(180010);
		System.out.println("Employee Name:" + ed.getEmpName());
		System.out.println("Employee Name:" + ed.getEmpAge());
		System.out.println("Employee Name:" + ed.getEmpID());
		
	}
}


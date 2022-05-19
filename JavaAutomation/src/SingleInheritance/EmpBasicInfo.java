package SingleInheritance;

public class EmpBasicInfo {
	private String empName;
	private char empGender;
	private String empDOB;
	private String empDOJ;
	private String empAddr;
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}
	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}
	public void setEmpDOJ(String empDOJ) {
		this.empDOJ = empDOJ;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	
	public void showEmployeeBasicInfo() {
		System.out.println("Employee name -> " + this.empName);
		System.out.println("Employee Gender -> " + this.empGender);
		System.out.println("Employee DOB -> " + this.empDOB);
		System.out.println("Employee DOJ -> " + this.empDOJ);
		System.out.println("Employee Address -> " + this.empAddr);
	}
	
}

package SingleInheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITDept itDept=new ITDept();
		itDept.setEmpName("Sunder Pichai");
		itDept.setEmpGender('M');
		itDept.setEmpDOB("12/Dec/1960");
		itDept.setEmpDOJ("12/Dec/2015");
		itDept.setEmpAddr("Cenntral Chennai");
		itDept.setProjectName("Google Services");
		//itDept.showEmployeeBasicInfo();
		itDept.showProjectName();
		
		
	}

}

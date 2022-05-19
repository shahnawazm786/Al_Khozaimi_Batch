package SingleInheritance;

public class ITDept  extends EmpBasicInfo{

	private String projectName;

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public void showProjectName() {
		super.showEmployeeBasicInfo();
		System.out.println("Project name -> "+this.projectName);
	}
	
}

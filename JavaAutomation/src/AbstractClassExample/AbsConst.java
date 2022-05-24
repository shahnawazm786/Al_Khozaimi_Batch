package AbstractClassExample;

public abstract class AbsConst {
	private double salary;
	private String empName;
	public AbsConst() {
		System.out.println("Abstract class constructor");
	}
	public AbsConst(double salary) {
		this.salary=salary;
		System.out.println(this.salary);
	}
	public AbsConst(double salary,String empName) {
		this.salary=salary;
		this.empName=empName;
		System.out.println(this.salary + "    "+ this.empName);
	}
}

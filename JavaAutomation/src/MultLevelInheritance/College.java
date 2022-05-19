package MultLevelInheritance;

public class College {
	private String colName;

	public void setColName(String colName) {
		this.colName = colName;
	}
	public void showCollegeName() {
		System.out.println("College name -> " + this.colName);
	}
}

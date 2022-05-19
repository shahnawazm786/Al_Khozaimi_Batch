package MultLevelInheritance;

public class Lecturer extends Lecture{
	private String lecName;
	private String lecQual;
	public void setLecName(String lecName) {
		this.lecName = lecName;
	}
	public void setLecQual(String lecQual) {
		this.lecQual = lecQual;
	}
	
	public void showDetails() {
		super.showLecture();
		System.out.println("Lecturer name -> "+this.lecName);
		System.out.println("Lecturer Qualification -> "+this.lecQual);
		
	}

}

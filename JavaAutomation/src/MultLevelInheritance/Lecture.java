package MultLevelInheritance;

public class Lecture extends College{

	private String subName;
	private int duration;
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void showLecture() {
		super.showCollegeName();
		System.out.println("Subject name -> "+ this.subName);
		System.out.println("Duration -> "+ this.duration);
	}
}

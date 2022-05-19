package InheritExample;

public class GSTClass {
	private double gSTRate;// 12.5% till dooms day 
	private String gstName;
	private int termYear;
	
	public double getgSTRate() {
		return gSTRate;
	}
	public void setgSTRate(double gSTRate) {
		this.gSTRate = gSTRate;
	}
	public String getGstName() {
		return gstName;
	}
	public void setGstName(String gstName) {
		this.gstName = gstName;
	}
	public int getTermYear() {
		return termYear;
	}
	public void setTermYear(int termYear) {
		this.termYear = termYear;
	}
	// show method
	public void showGSTValue() {
		System.out.println(this.gSTRate);
	}
	static public void message() {
		System.out.println("Hello!!!!");
	}
}

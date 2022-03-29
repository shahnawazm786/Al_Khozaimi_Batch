package pack4;

public class Car {
	// Getter and Setter method to supply data from the one package to another package
	private String modelName; // Data Hiding
	private int noOfWheel; // Data Hiding
	private double price; // Data Hiding
	/**
	 * @return the modelName
	 */
	public String getModelName() {
		return modelName;
	}
	/**
	 * @param modelName the modelName to set
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	/**
	 * @return the noOfWheel
	 */
	public int getNoOfWheel() {
		return noOfWheel;
	}
	/**
	 * @param noOfWheel the noOfWheel to set
	 */
	public void setNoOfWheel(int noOfWheel) {
		this.noOfWheel = noOfWheel;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}

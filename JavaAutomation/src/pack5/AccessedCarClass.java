package pack5;

import pack4.Car;

public class AccessedCarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.setModelName("Maruti-800");
		c.setNoOfWheel(4);
		c.setPrice(100000);
		System.out.println("Access the data member");
		System.out.println(c.getModelName());
		System.out.println(c.getNoOfWheel());
		System.out.println(c.getPrice());
	}

}

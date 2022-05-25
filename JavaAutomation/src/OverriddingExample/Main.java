package OverriddingExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelperClass hc; // Reference created of Abstract class
		hc=new ReadNotPad(); // child c
		hc.read();
		hc=new ReadWordPad();
		hc.read();
	}

}

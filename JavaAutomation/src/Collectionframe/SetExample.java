package Collectionframe;

import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> s=new HashSet<Integer>();
		s.add(10);
		s.add(-7);
		s.add(20);
		s.add(15);
		s.add(5);
		System.out.println(s);
		s.add(10);
		s.add(-7);
		System.out.println(s);
		
		
	}

}

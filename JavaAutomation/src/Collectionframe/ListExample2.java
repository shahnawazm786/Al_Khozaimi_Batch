package Collectionframe;

import java.util.*;
public class ListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<Integer>();
		li.add(1200);
		li.add(1300);
		li.add(1500);
		for(Integer a:li) {
			System.out.println(a);
		}
		System.out.println("Used Iterator");
		Iterator it=li.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		li.add(1, 1250);
		System.out.println("After Add");
		for(Integer a:li) {
			System.out.println(a);
		}
	
		li.remove(2);
	
	System.out.println("After Remove");
	for(Integer a:li) {
		System.out.println(a);
	}
	Object o=new Integer(1500);
	li.remove(o);
	System.out.println("After Remove");
	for(Integer a:li) {
		System.out.println(a);
	}
	}
}

package Collectionframe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList(2); // slow in work
		Object o=new String("Hello");
		l.add(o);
		o=new Integer(12);
		l.add(o);
		o=new Float(4.56789);
		l.add(o);
		System.out.println(l);
		
		ArrayList a=new ArrayList();
		a.add(o);
		System.out.println(a);
		//List<T> -> Template // Integer, String Double, Float, UDC
		
		List<Integer> li=new ArrayList<Integer>();
		li.add(1200);
		li.add(1400);
		li.add(700);
		li.add(450);
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		int[] num= {10,20,-5,70,90};
		//System.out.println(num);
		Arrays.sort(num);
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
	}

}

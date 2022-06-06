package Collectionframe;

import java.util.*;
public class SetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> name=new HashSet<String>();
		name.add("Delhi");
		name.add("Mumbai");
		name.add("Kolkatta");
		name.add(null);
		System.out.println(name);
		name.add(null);
		System.out.println("Iteration using for each loop");
		for(String nm:name) {
			System.out.println(nm);
		}
		System.out.println("Iteration using iterator interface");
		Iterator it=name.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}

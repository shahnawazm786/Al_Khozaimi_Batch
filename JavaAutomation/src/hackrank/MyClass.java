package hackrank;
import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Im main function()");
		List<String> list1=new ArrayList();
		list1.add("foo");
		List<String> list2=list1;
		List<String> list3=new ArrayList(list2);
		list1.clear();
		list2.add("bar");
		list3.add("baz");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}
	public static void main(char[] a) {
		System.out.println("a");
	}

}

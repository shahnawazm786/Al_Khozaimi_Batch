package Collectionframe;

import java.util.*;
public class SetExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Set<Integer> marks=new HashSet<>();
	Set<Integer> marks1=new HashSet<>();
	marks.add(10);
	marks.add(20);
	marks.add(30);
	
	marks1.add(100);
	marks1.add(200);
	marks1.add(300);
	marks1.add(30);
	
	Set<Integer> marks3=new HashSet<>(marks);
	marks3.addAll(marks1);
	System.out.println(marks3);// union
	
	Set<Integer> marks4=new HashSet<>(marks);
	marks4.retainAll(marks1);
	
	System.out.println(marks4); //intersection
	
	Set<Integer> marks5=new HashSet<>(marks);
	marks5.removeAll(marks1); // Minus
	System.out.println(marks5);
	
	Set<Integer> marks6=new HashSet<>(marks1);
	marks6.removeAll(marks); // Minus 
	System.out.println(marks6);
	}
}

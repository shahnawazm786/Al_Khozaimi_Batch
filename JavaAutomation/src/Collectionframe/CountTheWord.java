package Collectionframe;

import java.util.*;
import java.util.Map.Entry;
public class CountTheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> countWord=new HashMap<String,Integer>();
		String str="I am java am programmer. I java is robust langauge. java support opps";
		String[] word=str.split(" ");
		int cnt=1;
		List<String> li=new ArrayList<String>();
		
		for(String s1:word) {
			li.add(s1);
		}
		
		for(String s:word) {
			cnt=1;
			if(li.contains(s)) {
				if(countWord.get(s) == null)
				{
					countWord.put(s, cnt);
				}
				else {
					cnt=countWord.get(s);
					cnt++;
					countWord.put(s, cnt);
				}
			}
		}
		for(Entry<String,Integer> ent:countWord.entrySet()) {
			if(ent.getValue()>1) {
				
				System.out.println("Duplicate word -> "+ ent.getKey());
			}
		}
		System.out.println(countWord);	
	}

}

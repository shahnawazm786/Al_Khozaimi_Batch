package ArrayExample;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sub= {"Math","Biology","Chemistry","Java","Math"};
		int cnt=0;
		for(String s : sub) {
			cnt++;
		}
		System.out.println("Count of string ->"+cnt);
		String s1="Hello Hi I am great";
		StringBuilder sb=new StringBuilder(s1);
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb);
		
		
		boolean res=s1.equals(sb);
		System.out.println(res);
		
		String s2="Hi";
		String s3="Hi";
		res=s2.equals(s3);
		System.out.println(res);
		
		String s4=new String();
		String s5=new String();
		
		res=s4.equals(s5); // value 
		System.out.println(res);
		
		res=s4==s5; // object  
		System.out.println(res);
		System.out.println(s4 + "    "+s5);
		
	}
	

}

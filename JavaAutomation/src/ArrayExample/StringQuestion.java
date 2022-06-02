package ArrayExample;

public class StringQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		String s="Java is programming language";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='A') {
				cnt++;
			}
		}
		System.out.println("Count of a is ->"+cnt);
		
		int count=s.length() - s.replaceAll("a", "").length();
		System.out.println(count);

	}

}

package question;

public class CharacterCountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is my first string";
		//Mutable
		System.out.println(str);
		//str=str+" add string into existing one";
		//System.out.println(str);
		
		// count 'i' in string
		int cnt=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)=='i') {
				cnt++;
			}
		}
	System.out.println("Count of \'i\' => "+cnt);	
	
	}
	

}

package class11;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="JackandJill";
		System.out.println("Character access by loop of String object");
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		// for each loop
		System.out.println("For each loop");
		for(char c : str.toCharArray()) {
			System.out.println(c);
			
		}

	}

}

package question;

public class CharCountFromStringShortCutMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Hello I am java programmer";
		System.out.println(st);
		int tot=st.length();
		System.out.println("No of character =>"+tot);
		int tot_char=st.replace("m","").length();
		System.out.println("\'m\' occured ->" +(tot - tot_char)+" times");
	}
// Palindrome String
// MADAM => MADAM
// MALYALAM 
// Number Palindrome
// Number Order - ascending or descending
}

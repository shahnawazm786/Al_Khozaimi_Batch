package question;

public class CharacterCountUsingCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] st= {'T','h','i','s',' ','i','s',' ','m','y',' ','i'};
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]);
			if(st[i]=='i') {
				System.out.println("\'i\' found "+st[i]);
			}
			else
			{
				System.out.println("\'i\' not found but other char is found ->"+st[i]);	
			}
		}
	}

}

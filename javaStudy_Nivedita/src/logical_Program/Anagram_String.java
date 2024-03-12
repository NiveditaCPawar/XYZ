package logical_Program;

import java.util.Arrays;

public class Anagram_String {

	public static void main(String[] args) {
		
		String s="madam";//Madam,nitin,mom,dad
		String t="damam";
		char[] s1 = s.toCharArray();   //j a v a
		char[] t1 = t.toCharArray();
		Arrays.sort(s1);				//a a j v
		Arrays.sort(t1);				// a a j v
		//boolean result = Arrays.equals(s1, t1);
		if(Arrays.equals(s1, t1)) {
			System.out.println("Given string is anagram");
		}
		else {
			System.out.println("Given string is not angram");
		}
	}
	

//	
	

}

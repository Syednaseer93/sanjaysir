package programstrings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharString {

	public static void main(String[] args) {
		String str="kannada";

		LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			hs.add(ch);
			
		}
		for(Character ch1:hs) {
			System.out.print(ch1+" ");
		}
	}

}

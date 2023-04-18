package assignmentprograms;

import java.util.LinkedHashSet;

public class a3b2cd3f {

	public static void main(String[] args) {

		//aaabbcdddf  a3b2cd3f
		String str="aaabbcdddf";
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			hs.add(str.charAt(i));
		}
		for(Character ch:hs) {
			int count=0;
			for(int i=0;i<str.length();i++) {
				if(ch==str.charAt(i)) {
					count++;
				}
			}
			System.out.print(ch);
			if(count>1) {
				System.out.print(count);
			}
			
		}
	}

}

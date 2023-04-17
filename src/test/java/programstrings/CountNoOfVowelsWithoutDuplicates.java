package programstrings;

import java.util.LinkedHashSet;

public class CountNoOfVowelsWithoutDuplicates {

	public static void main(String[] args) {

		String str1="Engineer";
		String str=str1.toLowerCase();
		int count=0;
		LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			hs.add(str.charAt(i));
		}
		for(Character ch:hs) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'|ch=='u') {
				count++;
				System.out.print(ch);
			}

		}
		System.out.println("="+count);

	}
}

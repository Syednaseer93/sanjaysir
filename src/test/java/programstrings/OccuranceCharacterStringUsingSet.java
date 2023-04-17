package programstrings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OccuranceCharacterStringUsingSet {

	public static void main(String[] args) {
		String str="kannada";
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();

		for(int i=0;i<str.length();i++) 
		{
			hs.add(str.charAt(i));
		}
		for(Character ch:hs) {
			int count=0;
			for(int i=0;i<str.length();i++) 
			{
				if(ch==str.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ch+" "+count);
		}
	}

}

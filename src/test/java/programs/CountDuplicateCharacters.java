package programs;

import java.util.HashSet;

public class CountDuplicateCharacters {

	public static void main(String[] args) {
		String str="kannada";
		HashSet<Character> hs = new HashSet<Character>();

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
			if(count>1) {
				System.out.println(ch+" is repeating "+count+" many times");
			}
		}
	}

}



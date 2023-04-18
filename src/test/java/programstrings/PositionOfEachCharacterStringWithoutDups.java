package programstrings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PositionOfEachCharacterStringWithoutDups {

	public static void main(String[] args) {

		String str="kannada";
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			hs.add(str.charAt(i));
		}
		for(Character ch:hs) {
			for(int i=0;i<str.length();i++) {
				if(ch==str.charAt(i)) {
					System.out.println(ch+" is present in "+(i+1)+" position");
					break;
				}
			}
		}
	}

}

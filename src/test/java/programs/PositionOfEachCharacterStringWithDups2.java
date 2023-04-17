package programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PositionOfEachCharacterStringWithDups2 {

	public static void main(String[] args) {

		String str="kannada";
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			hs.add(str.charAt(i));
		}
		for(Character ch:hs) {
			for(int i=str.length()-1;i>=0;i--) {
				if(ch==str.charAt(i)) {
					//Starting from last
					System.out.println(ch+" is present in "+(i+1)+" position");
					break;
				}
			}
		}
	}

}

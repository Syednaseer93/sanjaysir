package programstrings;

import java.util.ArrayList;

public class SegregateAlphaNumSpecialCharacters {

	public static void main(String[] args) {
		String str="@+a*b+7&c!";
		String letters="";
		String numbers="";
		String spclChar="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z' ||ch>='A' && ch<='Z') {
				letters=letters+ch;
			}
			else if(ch>='0' && ch<='9') {
				numbers=numbers+ch;
			}
			else {
				spclChar=spclChar+ch;
			}
		}
		System.out.println(letters+numbers+spclChar);
		
	}

}

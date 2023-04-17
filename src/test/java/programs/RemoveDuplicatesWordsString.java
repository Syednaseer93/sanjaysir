package programs;

import java.util.LinkedHashSet;

public class RemoveDuplicatesWordsString {

	public static void main(String[] args) {

		String str="Test Test Yantra";
		LinkedHashSet<String> hs= new LinkedHashSet<String>();
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++) {

			hs.add(words[i]);

		}
		for(String word1:hs) {
			System.out.print(word1+" ");
		}
	}
}


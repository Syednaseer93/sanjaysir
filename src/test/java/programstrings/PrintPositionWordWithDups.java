package programstrings;

import java.util.LinkedHashSet;

public class PrintPositionWordWithDups {

	public static void main(String[] args) {

		String words[]= {"1","2","2","3","1"};
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		for(int i=0;i<words.length;i++) {
			hs.add(words[i]);
		}
		for(String word:hs) {
			for(int i=words.length-1;i>=0;i--) {
				if(word==words[i]) {
					System.out.println(word+" is present in "+(i+1)+" position");
					break;
				}
			}
		}
	}


}

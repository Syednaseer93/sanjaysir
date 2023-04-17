package programstrings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CountDuplicateWordsString {


	public static void main(String[] args) {
	
		String words[]= {"1","2","3","2","4","1"};
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		for(int i=0;i<words.length;i++) 
		{
			hs.add(words[i]);
		}
		for(String word:hs) {
			int count=0;
			for(int i=0;i<words.length;i++) 
			{
				if(word==words[i])
				{
					count++;
				}
			}
			if(count>1) {
				System.out.println(word+" is repeating "+count+" many times");
			}
		}
	}
}


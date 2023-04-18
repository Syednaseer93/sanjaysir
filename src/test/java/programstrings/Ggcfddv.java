package programstrings;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Ggcfddv {

	public static void main(String[] args) {
		String str="tom dick harry dick tom tom";
		String [] arr=str.split(" ");
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		for(String word:hs) {
			int count=0;
			for(int i=0;i<arr.length;i++) {
				if(word.equals(arr[i])) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(word);
			}
		}
	} 

}

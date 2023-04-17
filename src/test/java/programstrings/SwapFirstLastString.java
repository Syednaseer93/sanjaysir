package programstrings;

public class SwapFirstLastString {

	public static void main(String[] args) {
		String str="Tom Dick Harry";
		
		String words[] = str.split(" ");
		
		String temp=words[0];
		words[0]=words[words.length-1];
		words[words.length-1]=temp;
		
		for(String word:words) {
			System.out.println(word);
		}

	}

}

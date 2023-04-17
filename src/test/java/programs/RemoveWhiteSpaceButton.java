package programs;

public class RemoveWhiteSpaceButton {

	public static void main(String[] args) {
		String str="Test Yantra software solutions";
		String words[] = str.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.print(words[i]);
		
		}
		
	}

}

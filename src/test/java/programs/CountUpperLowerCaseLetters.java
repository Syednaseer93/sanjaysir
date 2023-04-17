package programs;

public class CountUpperLowerCaseLetters {

	public static void main(String[] args) {
		String str="RMG Bench";
		int upCount=0;
		int lowCount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLetter(ch)) {
				if(ch>='a' && ch<='z') {
					upCount++;
				}
				else if(ch>='A' && ch<='Z') {
					lowCount++;
				}
			}
		}
		System.out.println(lowCount+"  "+upCount);
	}

}

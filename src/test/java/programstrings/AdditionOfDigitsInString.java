package programstrings;

public class AdditionOfDigitsInString {

	public static void main(String[] args) {
		String str="a1b1c19";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9') {
				int n=str.charAt(i)-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);

	}

}

package programstrings;

public class AdditionOf2DigitsInString {

	public static void main(String[] args) {
		String str="a11b12c2";
		int sum=0;
		int tSum=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9') {
				int n=str.charAt(i)-48;
			
				tSum=tSum*10+n;
			}
			else {
				sum=sum+tSum;
				tSum=0;
			}
		}
		sum=sum+tSum;
		System.out.println(sum);
	}
}

package programstrings;

public class CountNoOfVowels {

	public static void main(String[] args) {
		
		String str1="Engineer";
		String str=str1.toLowerCase();
		
		char[] arr = str.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'|arr[i]=='u') {
				count++;
				System.out.print(arr[i]);
			}
		}
		System.out.println("="+count);
	}

}

package programstrings;

public class MinimumLenthStringInStringArray {
	public static void main(String[] args) {
		String arr[] = {"abc","abcd","aa","tt"};
		
		String minLenght=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(minLenght.length()>arr[i].length()) {
				minLenght=arr[i];
			}
			
		}
	
		for(int i=0;i<arr.length;i++) {
			
			if(minLenght.length()==arr[i].length()) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}

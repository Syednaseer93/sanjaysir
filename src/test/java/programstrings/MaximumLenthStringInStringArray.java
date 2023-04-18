package programstrings;

public class MaximumLenthStringInStringArray {

	public static void main(String[] args) {
		String arr[] = {"abc","abcd","aavd"};
		String maxLenght=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(maxLenght.length()<arr[i].length()) {
				maxLenght=arr[i];
				
			}
		
		}
	
		for(int i=0;i<arr.length;i++) {
			if(maxLenght.length()==arr[i].length()) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}

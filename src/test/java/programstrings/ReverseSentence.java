package programstrings;

public class ReverseSentence {

	public static void main(String[] args) {

		String str="I am a Software Engineer";
		String[] arr = str.split(" ");

		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}



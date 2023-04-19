package arrayprograms;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr= {5,1,3,2,9,6};
		int startIndex=0;
		int endIndex=arr.length-1;
		int temp=0;
		//if array has 5 elements use 2 here and if has  elements use 3
		for(int i=0;i<3;i++) { 

			temp=arr[startIndex];
			arr[startIndex]=arr[endIndex];
			arr[endIndex]=temp;

			startIndex++;

			endIndex--;
		}
		System.out.println(Arrays.toString(arr));

	}

}

package programarrays;

public class First3MinWithoutBubbleSortSum {

	public static void main(String[] args) {
		//wrong
		int a[]= {1,2,3,4,5,6};
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		//Traverse an array
		for (int i=0;i<a.length;i++) { 
			// If greater than highest 
			if (a[i]>max) {
				secondMax=max;
				max=a[i];
			}
			else if(a[i]>thirdMax) {
				thirdMax=a[i];
			}
		}
		System.out.println(max+" "+secondMax+" "+thirdMax);
	}
}

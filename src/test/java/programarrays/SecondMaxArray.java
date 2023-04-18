package programarrays;

public class SecondMaxArray {
	public static void main(String[] args) {
		int a[] = {1,2,4,6,8};
		int len = a.length;
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		//Traverse an array
		for (int i=0;i<len;i++) { 
			// If greater than highest 
			if (a[i]>max) {
				// Assign highest value into secondhigest
				secondMax=max;

				// Set new highest
				max=a[i];
			}
			// If number is less than highest and greater than secondHighest
			else if (a[i]>secondMax && a[i]!=max) {
				// Set second highest
				secondMax=a[i];
			}
		}
		System.out.println("Second maximum number is :  " + secondMax);
	}
}

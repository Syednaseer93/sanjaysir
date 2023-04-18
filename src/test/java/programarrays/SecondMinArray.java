package programarrays;

import java.util.Arrays;

public class SecondMinArray {

	public static void main(String[] args) {
		int a[] = {9,8,7,6,5,4,3,2,1,0};
		int min = a[0];
		int secondMin = a[0];

		for (int i=0;i<a.length;i++) { 
			// If lesser than lowest 
			if (a[i]<min) {
				// Assign lowest value into second lowest
				secondMin=min;
				// Set new lowest
				min=a[i];
			}
			// If number is greater than lowest and lesser than second lowest
			else if (a[i]>min && a[i]<secondMin) {
				// Set second highest
				secondMin=a[i];
			}
		}
		System.out.println("Second minimum is " + secondMin);
	}
}

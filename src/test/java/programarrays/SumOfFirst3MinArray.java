package programarrays;

public class SumOfFirst3MinArray {

	public static void main(String[] args) {
		int a[]= {5,1,3,2,4};
		int firstMin=a[0];
		int secondMin=a[0];
		int thirdMin=a[0];

		for(int i=0;i<a.length;i++) 
		{
			if(a[i]<firstMin) {
				firstMin=secondMin;
				secondMin=thirdMin;
				firstMin=a[i];
			}
		}
	}

}

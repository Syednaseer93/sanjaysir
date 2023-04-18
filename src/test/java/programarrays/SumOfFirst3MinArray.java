package programarrays;

public class SumOfFirst3MinArray {

	public static void main(String[] args) {
		int a[]= {5,1,3,2,4};
		int firstMin=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		int thirdMin=Integer.MAX_VALUE;

		for(int i=0;i<a.length;i++) 
		{
			if(firstMin>a[i]) {
				firstMin=a[i];
			}
			else if(secondMin>a[i] && secondMin!=firstMin) {
				secondMin=a[i];
			}
			else if(thirdMin>a[i] && thirdMin!=secondMin && thirdMin!=firstMin) {
				thirdMin=a[i];
			}
		}
		System.out.println(firstMin+" "+secondMin+" "+thirdMin);
	}

}

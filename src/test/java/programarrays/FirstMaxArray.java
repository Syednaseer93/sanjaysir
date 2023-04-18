package programarrays;

public class FirstMaxArray {
	public static void main(String[] args) {

		int a[] = {5,2,3,1,4};
		int max=a[0];
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}

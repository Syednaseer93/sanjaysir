package programs;

public class SortArrayBubbleSort {

	public static void main(String[] args) {

		int[] a= {5,1,3,4,2};
		int temp=0;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);	
		}	
	}
}

package programs;

public class SortArrayBubbleSortDecs {

	public static void main(String[] args) {

		int[] a= {1,3,51,7,54,2,4,6,5,8,5};
		int temp=0;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);	
		}	
	}
}

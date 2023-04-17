package programs;

public class Append0sinLastArray {

	public static void main(String[] args) {
	
		int a[]= {4,0,2,0,5,0};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==0) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
	}
}

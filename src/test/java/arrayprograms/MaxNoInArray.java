package arrayprograms;

import java.util.Scanner;

public class MaxNoInArray {
	public static void main(String[] args) {
		int a[]= {60,40,80,20,10};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("enter the which max no to find: (The array length is:"+a.length+" )");
		Scanner sc=new Scanner(System.in);
		int index = sc.nextInt();
		System.out.println("The value of the "+index +" maximum no in the array is: "+a[index-1]);
		sc.close();


	}
}

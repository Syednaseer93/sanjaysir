package programstrings;

import java.util.Scanner;



public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();		
	 
		long factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
			
		}
		System.out.println("The Factorial of number "+num+" is: "+factorial);
	}

}

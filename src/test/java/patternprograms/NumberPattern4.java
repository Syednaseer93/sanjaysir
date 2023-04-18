package patternprograms;

public class NumberPattern4 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			int s=5;
			for(int j=1;j<=i;j++)
			{
				System.out.print(s--+" ");				
			}
			
			System.out.println();
		}
	}
}

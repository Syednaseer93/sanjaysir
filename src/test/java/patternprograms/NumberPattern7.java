package patternprograms;

public class NumberPattern7 {

	public static void main(String[] args) {
		int n=5;
		char k='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(k+++" ");
			}
			System.out.println();
		}
	}

}

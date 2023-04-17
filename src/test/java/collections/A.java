package collections;

public class A {
	void showA()
	{
		System.out.println("Class A method");
	}
	
	static class B extends A
	{
		void showB()
		{
			System.out.println("Class B Method");
		}
	}
	static class C extends B
	{
		void showC()
		{
			System.out.println("Class C Method");
		}
	}

	public static void main(String[] args) {
		C c=new C();
		c.showA();
		c.showB();
		c.showC();
		
		

	}

}

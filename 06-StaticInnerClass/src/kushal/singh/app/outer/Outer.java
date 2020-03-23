 package kushal.singh.app.outer;

public class Outer {
	//this has to be static if inner class were to access this variable 
	//Accessing outer class element from the inner class
	private static int test = 5;
	
	private static void TestOuter() {
		System.out.println("Testing multiplication: "+ test*test);
	}
	
	public static void TestInnerValue() {
		System.out.println("Inner class value of x is: " + Inner.x);
	}
	public static class Inner{
		public static int x = 45;
		public static void TestingInnerClass() {
			System.out.println("Testing static inner class.");
			System.out.println("Testing accessing from inner to outer(test): "+ test);//Here we accessed outer class element from the inner class
			TestOuter();
		}
	}
}

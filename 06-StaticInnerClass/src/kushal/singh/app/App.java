package kushal.singh.app;

import java.io.FileNotFoundException;

import kushal.singh.app.outer.Outer;
import kushal.singh.app.outer.Profile;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		Outer.Inner.TestingInnerClass();
		System.out.println(Outer.Inner.x);
		System.out.println("Testing accessing from outer to inner(x): ");
		Outer.TestInnerValue();
		int x = 10;
		try {
			x = x/0;
		}catch(ArithmeticException e) {
			System.out.println("Arithmetric exception occured.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Error caught is: " + ex.getMessage());
		}finally {
			System.out.println("This is Finally block which always gets printed no matter we have caught excaption or not.");
		}
		
		//Example 3 - Throw and Throws
		someMethod();
		
		//EXAMPLE 4 - ENUM
		Profile p = Profile.AGE;
		switch(p) {
		case ADDRESS: System.out.println("310 8th ave s.");
			break;
		case AGE:System.out.println("Age is 23");
			break;
		case FIRSTNAME:System.out.println("first Name is kushal");
			break;
		case LASTNAME:System.out.println("Last name is Singh.");
			break;
		default:System.out.println("Reached the default.");
			break;
		
		}
		
		//Example 5 - foreach loop
		int[] arrr = {5,7,8,9,22};
		App app = new App();
		app.printArray(arrr);
		System.out.println(arrr[0]);
	}
	
	public static void someMethod() throws FileNotFoundException {
		//throw new FileNotFoundException();
		//FileReader in = new FileReader("file.txt");
		System.out.println("message from some method.");
	}
	
	public void printArray(int[] arr) {
		int count  = 0;
		for (int i : arr) {
			System.out.println("Value at " + count + " is: " + i);
			count++;
		}
		arr[0] = 124; //call by reference 
	}

}

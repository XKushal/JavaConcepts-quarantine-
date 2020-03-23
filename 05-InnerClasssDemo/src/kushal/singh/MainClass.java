package kushal.singh;

import java.util.Scanner;

import kushal.singh.door.AnonymousBox;
import kushal.singh.door.Door;
import kushal.singh.door.Window;

public class MainClass {

	//Example of inner class and User Input 
	public static void main(String[] args) {
		Door obj = new Door();
		obj.shopStatus();
		obj.getLock().setLock(false);
		obj.shopStatus();
		
		//Example of Nested class
		//1 - local class (non-static nested class)
		Window w = new Window();
		if(w.isLocked(args[0])) {
			System.out.println("Shop has closed.");
		}else {
			System.out.println("Shop is open.");
		}
		System.out.println(args[1]);//reads the command line argument
		
		//2 - Anonymous inner Class
		AnonymousBox aobj = new AnonymousBox();
		System.out.println("What is the code for the lock?");
		Scanner scanner = new Scanner(System.in);
		String code = scanner.next();
		scanner.close();
		if(aobj.getLock().isUnlocked(code)) {
			System.out.println("Door is closed.");
		}else {
			System.out.println("Door is open.");
		}
	}
	

}

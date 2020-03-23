package kushal.singh.main;

import kushal.singh.person.Person;

/* Encapsulation: Process of binding the class members(variables and methods) into single unit. 
 * Hide it from the outer world by making the field private, or setting getter or setter method 
 * for controlling the level of access */
public class MainClass {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.toString());
		System.out.println("Acess thru getter: " + p.getAge());

	}

}

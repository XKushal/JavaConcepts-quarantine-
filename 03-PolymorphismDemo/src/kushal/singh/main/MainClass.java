package kushal.singh.main;

import kushal.singh.iphone.IPhoneX;
import kushal.singh.phone.Phone;
import kushal.singh.samsung.Samsung;

public class MainClass {

	/* Polymorphism: multiple form of single entity */
	public static void main(String[] args) {
		
		//we cant access to its method unless we make it static or we create the object
		//Phone ph = new MainClass().phone(1);
		
		Phone p = new Phone("IPHONE XS MAX");
		System.out.println(p.getModel());
		p.features();

		//our usual way 
		IPhoneX ip = new IPhoneX("IPhoneXS MAX");
		System.out.println(ip.getModel());
		ip.features();

		// becasue of is-a relationship, it can be done
		Phone newObj = new IPhoneX("Iphone 11");
		System.out.println(newObj.getModel());
		newObj.features();

		Phone samObj = new Samsung("Galaxy J7");
		//Phone sobj  = new MainClass().phone(2);
		System.out.println(samObj.getModel());
		samObj.features();
	}

	public Phone phone(int dd) {
		switch (dd) {
		case 1:
			return new IPhoneX("IPHONE 6");
		case 2:
			return new Samsung("Note 5");
		}
		return null;
	}

}

package kushal.singh;


import kushal.singh.phone.IphoneX;

public class MainClass {

	public static void main(String[] args) {
		IphoneX obj = new IphoneX();
		String processor = obj.Processor();
		System.out.println("Processor "+ processor);

	}

}

package kushal.singh.main;

import kushal.singh.childAnimal.Bird;
import kushal.singh.childAnimal.Fish;
import kushal.singh.childAnimal.Reptile;
import kushal.singh.individualAnimal.Crocodile;
import kushal.singh.individualAnimal.Eagle;
import kushal.singh.individualAnimal.Eel;
import kushal.singh.main.animal.Animals;

public class Maindemo {

	public static void main(String[] args) {
		Animals animal = new Animals();
		System.out.println("1: "+ animal.toString());
		Reptile rep = new Reptile();
		System.out.println("2: "+ rep.toString());
		Fish fish = new Fish();
		System.out.println("3: "+ fish.toString());
		Bird bird = new Bird();
		System.out.println("4: "+ bird.toString());
		Crocodile croc = new Crocodile();
		System.out.println("5: "+ croc.toString());
		Eel el = new Eel();
		System.out.println("6: "+ el.toString());
		Eagle eagle = new Eagle();
		System.out.println("7: "+ eagle.toString());
		

	}

}

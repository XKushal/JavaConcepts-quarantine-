package kushal.singh.app;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;

//Based on the length sorting is done using comparable interface
class Names implements Comparable<Names>{
	private String name;
	public Names(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Names newName) {
		if(name.length() == newName.name.length()) {
			return 0;
		}else if(name.length() < newName.name.length()) {
			return -1;
		}else {
			return 1;
		}
		
	}
	
	@Override
	public String toString() {
		return name;
	}

}

public class App{

	public static void main(String[] args) {
		List<Names> NameList = new ArrayList<>();
		NameList.add(new Names("Kushal"));
		NameList.add(new Names("Sing"));
		NameList.add(new Names("Ksh"));
		NameList.add(new Names("Ha"));
		NameList.add(new Names("M"));
		NameList.add(new Names("Banduuu"));
		
		App app = new App();
		System.out.println("The list of names before sorting: ");
		app.DisplayList(NameList);
		
		Collections.sort(NameList);
		System.out.println("\nThe list of names are after sorting: ");
		app.DisplayList(NameList);
	}
	
	public void DisplayList(List<Names> list) {
		ListIterator<Names> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}

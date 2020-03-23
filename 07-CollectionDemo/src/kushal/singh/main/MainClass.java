package kushal.singh.main;

import java.util.List;//List interface
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

//custom wrapper list 
class intWrapper{
	public int x;
	
	public intWrapper(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
}
public class MainClass {

	//we are using list interface of type ArrayList
	static List<String> NameList = new ArrayList<>(); // we are calling the default constructor of array list

	public static void main(String[] args) {
		MainClass app = new MainClass();
		NameList.add("Kushal");
		NameList.add("Singh");
		NameList.add("Kshitiz");
		NameList.add("Hamal");
		NameList.add("Mala");
		NameList.add("Bandu");
		app.DisplayList(NameList);
		System.out.println("*****************");
		app.removeNameByPosition(1);
		app.DisplayList(NameList);
		System.out.println("*****************");
		app.removeNameByString("Hamal");
		app.DisplayList(NameList);
		System.out.println("*****************");
		app.ModifyName(3, "Deepesh");
		app.DisplayList(NameList);
		System.out.println("*****************");
		app.SearchAndModify("Deepesh", "Bandana");
		app.DisplayList(NameList);
		
		//EXAMPLE 2 - AUTOBOXING AND UNBOXING
		List<intWrapper> rollNo = new ArrayList<>();
		rollNo.add(new intWrapper(1));//AUTOBOXING
		System.out.println("UNBOXING intwrapper: " + rollNo.get(0).getX());//Unboxing
		
		//THIS IS WHAT HAPPENS IN THE BACKGROUND WHEN CALLED RESPECTIVE FUNCTION FOR ADDING AND DISPLAYING
		NameList.add(String.valueOf("Deepesh"));//AUTOBOXING
		System.out.println("UNBOXING NameList: " + NameList.get(0));
		
		//EXAMPLE 3 - STACK
		Stack<Integer> num = new Stack<>();
		num.push(1);
		num.push(2);
		num.push(3);
		num.pop();
		System.out.println("Stack has: ");
		for (Integer integer : num) {
			System.out.println(integer);
		}
		if(num.isEmpty()) {
			System.out.println("Stack is not empty");
		}else {
			num.search(2);
			System.out.println("search is complete.");
			System.out.println("Stack is not empty");
		}
		
		//EXAMPLE 4 - ITERATOR
		app.printList(NameList);
		NameList.sort(null);
		app.printList(NameList);//sort
		Collections.reverse(NameList);
		app.printList(NameList);//reverse
		//compareTo method and works only for objects 
		System.out.println(NameList.get(0).compareTo("St cloud state"));
	}
	
	public void printList(List<String> list) {
		Iterator<String> iterator = list.iterator();
		System.out.println("\n************");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
	public void DisplayList(List<String> nameList) {
		for (String name : nameList) {
			System.out.println(name);
		}
	}

	public void removeNameByPosition(int position) {
		NameList.remove(position);
	}

	public void removeNameByString(String name) {
		NameList.remove(name);
	}
	
	public void ModifyName(int position, String name) {
		//set - replce the element at given position with specified position
		NameList.set(position, name);
	}
	
	public void SearchAndModify(String name, String newName) {
		int x = NameList.indexOf(name);
		ModifyName(x, newName);
	}
}

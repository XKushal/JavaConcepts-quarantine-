package kushal.singh.app.generic;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

class Data<T>{
	private T name;
	public Data(T name) {
		this.name = name;
	}
	
	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return (String) name;
	}

}

public class GenericClass{

	public static void main(String[] args) {
		List<Data<Object>> NameList = new ArrayList<>();
		NameList.add(new Data<Object>("Kushal"));
		NameList.add(new Data<Object>(1));
		NameList.add(new Data<Object>("Kshitiz"));
		NameList.add(new Data<Object>("%$#"));
		NameList.add(new Data<Object>(2.33));
		
		GenericClass app = new GenericClass();
		System.out.println("The list of elements: ");
		app.DisplayList(NameList);
	}
	
	public void DisplayList(List<Data<Object>> list) {
		ListIterator<Data<Object>> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
	}

}


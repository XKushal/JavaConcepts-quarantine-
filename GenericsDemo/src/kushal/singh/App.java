package kushal.singh;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.xml.stream.events.Characters;

//regular class 
class Data{
	private Object obj;
	
	public Data(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return (String) obj;
	}
	
}

//Generic Class
class GenericClass<T>{
	private T data;
	
	public GenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return (String) data;
	}
	
}

//Generic class with type parameters
class GenericTypeParameters<K, V>{
	private K key;
	private V value;
	
	public GenericTypeParameters(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "key:" + key + ", value:" + value ;
	}
	
	//Generic Method
	public <E , N extends Number> void display(E c, N i) {
		System.out.println("element: " + c + ", Number: " + i + "\n****************");
	}
	
	public <E> void displayList(List<E> arrayList) {
		System.out.println("\nList of elements: ");
		for (E e : arrayList) {
			System.out.println(e);
		}
	}
	
}

public class App {

	public static void main(String[] args) {
		
		//Regular Object Class Implementation
		Data name = new Data("Some String");
		String someVar =(String) name.getObj();
		System.out.println(someVar + "\n*************");

		//Generic Class Implementation
		List <GenericClass<Object>> data = new ArrayList<>();
		data.add( new GenericClass<Object>("Kushal"));
		data.add( new GenericClass<Object>(17));
		data.add( new GenericClass<Object>("Nepal"));
		System.out.println("\nThe list of elemets: ");
		
		App app = new App();
		app.displayData(data);
		
		//Generic class parameter type implementation
		List<GenericTypeParameters<Integer, String>> dataType = new ArrayList<>();
		GenericTypeParameters<Integer, String> sth = new GenericTypeParameters<Integer, String>(4, "some string");
		dataType.add(new GenericTypeParameters<Integer,  String>(1, "Kushal"));
		dataType.add(new GenericTypeParameters<Integer,  String>(2, "Singh"));
		dataType.add(new GenericTypeParameters<Integer,  String>(3, "Nepal"));
		System.out.println("\nThe parameter list are: ");
		app.printList(dataType);
		sth.display("Element" , 1);
		sth.displayList(dataType);

	}
	
	public void displayData(List<GenericClass<Object>> dataList) {
		ListIterator<GenericClass<Object>> iterator = dataList.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getData());
		}
	}
	
	public void printList(List<GenericTypeParameters<Integer, String>> list) {
		ListIterator<GenericTypeParameters<Integer, String>> iterator = list.listIterator();
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			System.out.println(iterator.next());
		}
	}

}

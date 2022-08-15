import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>(); // This list is of type ArrayList
		list1.add("Jiten");
		list1.add("Rahim");
		list1.add("Pooja");
		list1.add("Bob");
		list1.add("Alicia");

		for (String s : list1) {
			System.out.println("Name->" + s);
		}

		// change the value of an element in the list
		
		list1.set(4, "Alisha");
		
		// Get the list by index
		System.out.println("Get the list of elements using list.get method");

		for (int i = 0; i < list1.size(); i++) {
			System.out.println("Name->" + list1.get(i));
		}

		// sorting the list
		Collections.sort(list1);
		System.out.println("Checking the list after  is sorted");
		for (String s : list1) {
			System.out.println("Name->" + s);
		}

		list1.clear(); // removes all the elements from the list
		System.out.println("Checking the list after clear is called");
		for (String s : list1) {
			System.out.println("Name->" + s);
		}

	}

}

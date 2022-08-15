import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> hashset= new HashSet<String>();
		
		hashset.add("London");
		hashset.add("Bangalore");
		hashset.add("Newyork");
		hashset.add("Chicago");
		hashset.add("Hyderabad");
		System.out.println("Has added? "+hashset.add("London"));
		
		System.out.println("Is hashset contains Hyderabad? "+hashset.contains("Hyderabad"));
		System.out.println("Is hashset contains Goa? "+hashset.contains("Goa"));

		System.out.println("Size of hashset is not 6 here because London is duplicate entry: "+hashset.size()); // only 5 elements bcz duplicates there
		
		System.out.println(hashset);
		
		hashset.add("Goa");
		
		System.out.println("\nDisplay elements in hashset using for: loop");
		for(String s:hashset) {
			System.out.println(s);
		}
		
		hashset.remove("Goa"); // Goa will not be printed in the below code, because it has been removed.
		System.out.println("\nDisplay elements in hashset using iterator");
		
		Iterator setIterator = hashset.iterator();
		while(setIterator.hasNext()) {
			System.out.println(setIterator.next());
			setIterator.remove();
		}

		hashset.clear();
		System.out.println("Size of hashset after clear: "+hashset.size());

	}

}

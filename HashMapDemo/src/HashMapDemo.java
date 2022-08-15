import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> hashmap = new HashMap<String,Integer>();
		
		hashmap.put("Jiten", 100);
		hashmap.put("David", 101);
		hashmap.put("Alena", 102);
		hashmap.put("Pooja", 104);
		//hashmap.put("Amanda", "Hello Amanda"); // Since the value is Integer type only integers can be given
		// Each entry in the hashmap is called as Entry. So to fetch using for : loop must use this.
		for(Entry<String,Integer> i:hashmap.entrySet()) {
			System.out.println("Key:"+i.getKey()+" Value:"+i.getValue());
		}

		// How to update a value from hashmap
		
		hashmap.put("Pooja",103);
		System.out.println("\nDisplaying details after an update in the map");
		for(Entry<String,Integer> i:hashmap.entrySet()) {
			System.out.println("Key:"+i.getKey()+" Value:"+i.getValue());
		}
	}

}

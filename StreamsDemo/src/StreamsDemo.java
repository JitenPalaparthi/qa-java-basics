import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(1,2,4,2,5,5,8,8,9,7,5,6,7,8);

		Stream<Integer> square = number.stream();
		//System.out.println("Count--->"+square.count());

		/*
		 * square.forEach(n -> { System.out.println(n * n); });
		 * 
		 * System.out.println("Data in squre");
		 */
		
		/*
		 * List<Integer> square1 = number.stream().map(x -> x*x)
		 * .collect(Collectors.toList());
		 */
		
		number.stream().map(x -> x*x).forEach(n -> { System.out.println(n); });
		//System.out.println("Count-->"+square.size());
		
		System.out.println("number list-->"+number);
		
		System.out.println("Using filter on streams");
	    List<String> names = Arrays.asList("Bob", "Satish","John","Alena","Steve");
	    List<String> result = 
	        names.stream()
	            .filter(str -> str.startsWith("S"))
	            .collect(Collectors.toList());
		
		System.out.println(result);
		
		System.out.println("Using filter on sort");
		
		List<String> sortedNames=names.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedNames);
		
		// Reduce 
		
		System.out.println("Reduce operation on stream");
		
		int even = 
		        number.stream()
		            .filter(x -> x % 2 == 0)
		            .reduce((a,b) -> a+b)
		            .get();
		
		System.out.println("Reduced value-> "+even);
		
		// Distinct stream to list
		List<Integer> distinctNumbers = number.stream().distinct().toList();
		System.out.println("Distinct operation on stream");
		
		System.out.println("Distincted Numbers list->"+distinctNumbers);
		
	}
}

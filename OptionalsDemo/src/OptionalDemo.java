
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String item;
		
		
		if(Math.random() >= 0.5) {
		    item = "Hello";
		} else {
		    item = null;
		}
	
		Optional<String> optional = Optional.ofNullable(item);
		
		if(optional.isEmpty()) {
			System.out.println("item is empty");
		}else if(optional.isPresent()) {
			System.out.println(item+ " value is presented in item");
		}
		
		System.out.println(optional.orElse("Hello World!"));
		
//		optional.orElse("Hello World!")
		
//		if(item==null || item=="") {
//			item="Hello World";
//		}else{
		
//			}
		
//		String val= (item==null || item=="")?"Hello World":item;
		
		
		
		System.out.println(optional.get());
		
		
		optional.map(theItem -> "Good bye");	
		
		optional.ifPresent(theItem -> System.out.println("The value is through map lamda: "+theItem));
	
		//System.out.println(Optional.of(item));
		
		
		int age = 17;

		System.out.println((age>=18)?"Eligible to vote in elections":"Not eligible to vote in elections");
	// (condition)?value on true:value on false
		
		
		int i = 1; 
		Integer myInt = Integer.valueOf (i);
		// Now start using myInt for all Optional as myInt is nullable 
		
	}

}



//docker run -d --name mysqldb -e MYSQL_ROOT_PASSWORD=admin123 -p 6603:3306 mysql


public class StringDemo {

	public static void main(String[] args) {
		
		String str1 = "Hello World"; // Normal declaration
		System.out.println(str1);

		String str2 = "Hello World"; // Normal declaration
		System.out.println(str2);
		
		String str3 = new String("Hello World"); //another way of impleenting string. using new keyword
		System.out.println(str3);
		
		String str4 = new String("Hello World"); //another way of impleenting string. using new keyword
		System.out.println(str4);
		
		
		System.out.println("Is str1 equal to str2? "+(str1==str2));
	
		System.out.println("Is str1 equal to str3? "+(str1==str3)); //cannot perform this operation. when perform it may give to wrong result
		
		System.out.println("Is str3 equal to str4? "+(str3==str4));// cannot perform this operation. when perform it may give to wrong result
		
		System.out.println("Is str3 equal to str4? "+str3.equals(str4));

		// creating string through char array
		
	      char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '.' }; // an array of chars
	      
	      String str5 = new String(helloArray); // can create a string object using char array
	      
	      System.out.println(str5);
	      
	      System.out.println("Lengh of the string"+str5.length());
	      
	     for(int i=0;i<str5.length();i++) {
	    	 char c = str5.charAt(i);
	    	 System.out.print(c+" ");
	     }

	}

}

// create CharAt method by your self.

// public static char getChar(String str, int index) 

// public static int firstIndexOf(String str, char ch)

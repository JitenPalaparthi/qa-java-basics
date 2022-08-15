
public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str4 ="Hello";
		String str5 ="World";
		String str3 = str4+str5; // concatination
		
		// usually + is an arth operator. That means it is designed to perform arth operations
		// + operation on strs is called operator overloading concept. We cannot perform operator overloading in java but for ease of use/
		// + is overloaded for strings so that strings can be concatinated.
		
		String str6 = new String("Hello");
		String str7 = new String("World");

		
		
		str6 = str6.concat(str7);
		
		System.out.println(str6);
		
		System.out.println(str3);
		
		//
		 String str1 = "ThIsIsSoMeTeXt";
	        String str2 = "thisissometext";

	     
	        // Converts text to lowercase
	        System.out.println(str1.toLowerCase());// output will be: thisisometext

	        // Converts text to UPPERCASE
	        System.out.println(str1.toUpperCase()); // output will be: THISISSOMETEXT

	        // Returns the character at the specified index
	        System.out.println(str1.charAt(3)); // output will be: s

	        // Returns the first position of the character specified.
	        System.out.println(str1.indexOf("I")); // output will be: 2

	        // Returns true or false if the string ends with the specified character
	        System.out.println(str1.startsWith("t")); // output will be: false

	        // Returns true or false if the string ends with the specified character
	        System.out.println(str1.endsWith("t")); // output will be: true

	        // Returns true or false if the string contains the specified characters
	        System.out.println(str1.contains("So")); // output will be: true

	        // Returns a new string that is a substring of this string.
	        // start index is inclusive and endindex is exclusive
	        System.out.println(str1.substring(1, 3)); // output will be: hIs

	        // Checks if the values of two strings are the same:
	        System.out.println(str1.equals(str2)); // output will be: false

	        // Compares two strings ignoring case considerations:
	        System.out.println(str1.equalsIgnoreCase(str2)); // output will be: true
	        
	        // HELLO 
	        // Hello
	        // if you say equalsIgnoreCase then above strings are equal.

	        //Searches a string for a specified value and then replaces it with another value
	        System.out.println(str1.replace("SoMe", "SOMEREALLYFUN"));  //output will be: ThIsIsSOMEREALLYFUNTeXt
		
	}

}

// Create a method called subString(String str, int startIndex,int lastIndex)
// what if the startIndex is wrong
// what if the length of the startIndex or lastIndex exceeds the length of string?
// what if user gives negative startIndex and (or) negative lastIndex
// You can write in the comments that in case any error in the input the method returns -1

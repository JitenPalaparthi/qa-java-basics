
public class CallByValOrRefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 100;
		System.out.println("Value of num1 before calling changeVal method:"+num1);

		changeVal(num1,200); // --> This is called call by value
		
		System.out.println("Value of num1 after calling changeVal method:"+num1);
		
		Number n1 = new Number();
		System.out.println("Before calling the changeValObj methd:"+n1.n);
		
		changeValObj(n1,200); //--> This is call by reference
		System.out.println("After calling the changeValObj methd:"+n1.n);
		
		String str = "Hello World!"; // Strings are passed as values not as references
	    
		changeStr(str);
		
		System.out.println("After changing the actual string:"+str);

	}
	
	public static void changeVal(int num,int val) {
		num=val;
	}
	
	public static void changeValObj(Number num, int val) {
		num.n = val;
	}
	
	public static void changeStr(String str) {
		str= "Hello Universe!";
	}

}
class Number{
	int n = 100;
}

// Object Add(Object a, Object b) --> Add can add any value like int,float,double etc.. any number type
// Object Sub(Object a, Object b)-->  Substract any kind of value. All numeric  types
// Object Multiply(Object a , Object b)

// 1- This should work for all Numeric types.
// 2. User can be able to pass as many adds as he can. 
// 3- Use  concept called Boxing and UnBoxing








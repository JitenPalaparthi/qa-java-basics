
public class SingleTonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var obj1 = SingleTon.getInstance();
		System.out.println("Object-->"+obj1+"  Count:"+obj1.getCount());
		var obj2=SingleTon.getInstance();
		System.out.println("Object-->"+obj2+"  Count:"+obj2.getCount());
		var obj3=SingleTon.getInstance();
		System.out.println("Object-->"+obj3+"  Count:"+obj3.getCount());
		
		//var obj4= new SingleTon(); // cant do this.
	}

}


final class SingleTon{
	
	private static SingleTon obj;
	private int count=0;
	
	// The purpose of private constructor is not to create an object. 
	// Since the constructor is private it does not let the user to create an instance
	private SingleTon() {
	
	}
	
	public static SingleTon getInstance() {
		if(obj==null) {
			obj=new SingleTon();
		}
		obj.count++;
		return obj;
	}
	
	public int getCount() {
		return obj.count;
	}
}
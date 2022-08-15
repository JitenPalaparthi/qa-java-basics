
public class GarbageCollectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1;
		{
		c1= new C(100,200,300.45f,500.50);
		}
		// since c1 is not longer used after the above scope. It is a potential candidate for GC
		
		System.gc(); // enforcing the Garbage Collector to clean
		System.out.println(c1.v1);
		C c2= new C(100,200,300.45f,500.50);
		
		c2 = null;
	//	System.out.println(c2.v1);
		// When the object is declared as null then it is a potential candidate for GC
		
		C c3= new C(100,200,300.45f,500.50);
		C c4 = c3;
		// Since c3 is assign to c4 then c3 is a potential candidate for GC
		Create(); // c5 inside Create method is a potential candidate for GC because it is created inside a method but never referenced outside.
	}
	
	public static void Create() {
		C c5;
		{
		c5= new C(100,200,300.45f,500.50);
		}
	}

}


class C{
	int v1;
	long v2;
	float v3;
	double v4;
	
	public C() {
		
	}
	
	public C(int v1, long v2, float v3, double v4) {
		this.v1=v1;
		this.v2=v2;
		this.v3=v3;
		this.v4=v4;
	}
}

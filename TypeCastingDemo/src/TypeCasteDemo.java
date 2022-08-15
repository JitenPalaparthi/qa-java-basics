
public class TypeCasteDemo {

	public static void main(String[] args) {

		
		
		float float1 = 12.456f; // 4 bytes
		
		double double1 = float1; // 8 bytes. 4 bytes can be automatically fit into 8 bytes. So this is implicit conversion
		
		
		double double2 = 12.34324234;
		
		float float2 = (float)double2; // 8 bytes cannot be fit into 4 bytes so explicit 
		
		float a1 = add(12.45f,15.67f);
		
		float a2 = add((float)12.45,(float)15.67);
		
		// Another example
		
		byte b1 = 100;
		
		int i1= b1;
		
		int i2 = 1200; // 8 bytes
		
		byte b2= (byte)i2; // 1 byte 8 bits.. -127 to 127 0 to 255
		//
		
		System.out.println("b2 value after shrink:"+b2);
	}
	
	public static float add(float a, float b) {
		return a+b;
	}

}

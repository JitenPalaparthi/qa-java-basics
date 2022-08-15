import java.util.Arrays;
import java.util.List;

public class ComplexDemo {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,4,2,5,5,8,8,9,7,5,6,7,8};
		printFirstInt(arr); //O(1)
		printLinearInt(arr);//O(n) that means n is number of elements in the array
	    int[] arr2=bubbleSort(arr);
	    printLinearInt(arr2);

	    
	}
	
	// Constant time
	public static void printFirstInt(int[] arrayOfInts) {
	    System.out.println(arrayOfInts[0]);
	}
   
	// Linear Complexity 
	public static void printLinearInt(int[] arrOfInts) {
		for(int i : arrOfInts) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	// Quadratic Time O(n^2)
	public static int[] bubbleSort(int[] arrayOfInts) {
		int count=0;
	    for(int i = 0; i < arrayOfInts.length; i++) {
	        for(int j = 0; j < arrayOfInts.length; j++) {
	        	count++;
	            if(arrayOfInts[j] > arrayOfInts[i]) {
	                int temp = arrayOfInts[i];
	                arrayOfInts[i] = arrayOfInts[j];
	                arrayOfInts[j] = temp;
	            }
	        }
	    }
	    System.out.println("Length of array:"+arrayOfInts.length+" loop Count:"+count);
	    return arrayOfInts;
	}
}

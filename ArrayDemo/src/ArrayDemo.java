
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 10, 14, 15, 3, 16, 9 };
		int[] arr2 = new int[arr1.length];
		int[][][] arr2by2 = new int[3][2][3];
		
		
		for (int i : arr1) { // This is another kind of loop usually handy loop working with collections
			System.out.print(i + " ");
		}

		System.out.println("\nSum of elements in an array:" + Sum(arr1));

		// copying one array to another array
		// please implement it as a function
		for (int i = arr1.length - 1, j = 0; i >= 0; i = i - 1, j = j + 1) {
			arr2[j] = arr1[i];
		}

		System.out.println("Reverse array in arr2\n");

		for (int i : arr2) { // This is another kind of loop usually handy loop working with collections
			System.out.print(i + " ");
		}

		// Multidimensional array

		int[][] twoDArray = { { 25, 30, 21 }, { 56, 67, 39 }, { 8 } };

		System.out.println("\n2d array");
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {
				System.out.print(twoDArray[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Assigning elements to the array");
		int count = 1;
		for (int i = 0; i < arr2by2.length; i++) {
			for (int j = 0; j < arr2by2[i].length; j++) {
				for (int k = 0; k < arr2by2[i][j].length; k++) {
					arr2by2[i][j][k] = count;
					count++;
				}
			}

			System.out.println("\narr2by2 array");
			for (int i1 = 0; i1 < arr2by2.length; i1++) {
				for (int j = 0; j < arr2by2[i1].length; j++) {
					for (int k = 0; k < arr2by2[i1][j].length; k++) {
						System.out.print(arr2by2[i1][j][k] + " ");
					}
					System.out.println();
				}
				System.out.println();
			}
		}
	}

	public static int Sum(int[] arr) {
		int sum = 0;
		for (int e : arr) {
			sum = sum + e;
		}
//		for (int i=0;i<arr.length;i++) {
//		sum= sum+arr[i];
//		}
		return sum;
	}
}

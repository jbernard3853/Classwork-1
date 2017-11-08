package Lab3_1;

public class ArrayMethods {

		public static void main(String[] args) {
			int[] test = {3,2,2,1,3,4,6,7};
			int[] dupes = removeDuplicates(test);
			for (int i = 0; i < dupes.length; i++) {
				System.out.println(dupes[i]);			
			}
		}
		
		public static int[] removeDuplicates(int[] list)
		{
			int[] unique = new int[list.length];
			boolean isDupe = false;
			for (int i = 0; i < list.length; i++) {
				for (int j = i+1; j < list.length; j++) {
					if (list[i] == list[j]) {
						isDupe = true;
					}
					if (isDupe == false) {
						unique = list[i];
					}
				}
			}
			return unique;
		}
		
		public static int[][] productArray(int[] arr1, int[] arr2)
		// row column
		{
			int[][] product = new int[arr1.length][arr1.length];
			int row = 0;
			int column = 0;
			if (arr1.length == arr2.length) {
			for (int num : arr1) {
				for (int x: arr2) {
					product[row][column] = num * x;
					row++;
				}
			}
			}
		}
		
		public static int[ ][ ] pascalTriangle(int n)
		{
			
		}
		
		public static void printPascalTriangle(int[ ] [ ] triangle)
		{
			
		}
	}
	

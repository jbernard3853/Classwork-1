package Lab3_1;

public class ArrayMethods {

		public static void main(String[] args) {
			int[] test = {3,2,2,1,3,4,6,7};
			System.out.println(removeDuplicates(test));
		}
		
		
		public static int[ ] removeDuplicates(int[] list)
		{
			int[] cleaned = new Int;
			for (int i = 0; i < list.length-1; i++) {
				for (int j = i+1; j < list.length; j++) {
					if (list[i] != list[j]) {
						cleaned[i] = list[i]; 
					}
				}
			}
			return cleaned;
		}
		
		public static int[][] productArray(int[] arr1, int[] arr2)
		
		{
			
		}
		
		public static int[ ][ ] pascalTriangle(int n)
		{
			
		}
		
		public static void printPascalTriangle(int[ ] [ ] triangle)
		{
			
		}
	}
	

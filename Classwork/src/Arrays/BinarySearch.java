package Arrays;

public class BinarySearch {
	public static void main (String[] args) {
		int[] test1 = {0,1,2,3,4,5,6,7,8,9};
		//int[] test2 = {0,4,5,6,12,15,17,23,29};
		int[] test2 = {0,1,2,3,4,5,6,7,8};
		//System.out.println(binarySearch(test1,3,0,test1.length)); //2
		//System.out.println(binarySearch(test2,23,0,test2.length)); //7
		//System.out.println(binarySearch(test1,1,0,test1.length)); // 0, this one may cause an error
		//System.out.println(binarySearch(test2,29,0,test2.length)); // -1, this one may cause an error
																	// What's the error message?
																	// How can we fix it?
		for (int i = -1; i < test1.length+1; i++) {
			System.out.print(binarySearch(test1, i, 0, test1.length));
		}
		System.out.println();
		for (int i = -1; i < test2.length+1; i++) {
			System.out.print(binarySearch(test2, i, 0, test2.length));
		}
		System.out.println();
	}
	
	public static int binarySearch(int[] nums, int query, int first, int last) {
		if (first < last) // if still have some array left to search
		{
			int index = (first+last)/2;
			int guess = nums[index];
			
			//System.out.println(index);
			if (guess == query) {
				return index;
			}
			if (guess > query) {
				return binarySearch(nums,query,first,index);
			}
			
			return binarySearch(nums,query,index+1,last);
		}
		return -1;
	}
}

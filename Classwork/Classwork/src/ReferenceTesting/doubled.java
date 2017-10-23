package ReferenceTesting;

public class doubled {

		public static void main(String[] args) {
			String foo = "foo";
			String foofoo = doubleString (foo);
			System.out.println(foo);
			System.out.println(foofoo);
			String[] shopArr = {"milk", "cookies", "bread"};
			System.out.println(doubleInt(5));
			System.out.println(doubleArray(shopArr));
		}
		
		public static int doubleInt (int x) {
			x = x+x;
			return x;
		}
		
		public static String doubleString (String str1) {
			str1 = str1 + str1;
			return str1;
		}
		
		public static String[] doubleArray (String[] array) {
			for (int i = 0; i < array.length; i++) {
				array[i] = doubleString(array[i]);
				System.out.println(array[i]);
			} 
			return array;
		}
	}

	


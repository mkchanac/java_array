import java.util.Arrays;

public class ReverseArray {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] array = { 5, 4, 3, 2, 1 };
//
//		System.out.println(Arrays.toString(array));
//
//		reverse(array);
//
//		System.out.println(Arrays.toString(array));
//
//	}

	private static void reverse(int[] array) {
		int[] tempArray = new int[array.length];
		tempArray = Arrays.copyOf(array, array.length);
		System.out.println("Array = " + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			array[array.length - (i + 1)] = tempArray[i];
			array[i] = tempArray[array.length - (i + 1)];

		}
		
		System.out.println("Reversed array = " + Arrays.toString(array));
	}

}

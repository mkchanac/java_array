import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

//	public static void main(String[] args) {
//
//		int[] array = getIntegers(6);
//		int[] sortedArray = sortIntegers(array);
//		printArray(sortedArray);
//		for(int i = 0; i<6;i++) {
//		System.out.println(array[i]);}
//
//	}

	public static int[] getIntegers(int size) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[size];
		System.out.println("Enter " + size + " integer values:\r");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		return array;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " contents " + array[i]);
		}
	}

	public static int[] sortIntegers(int[] array) {
		int[] sortedArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			sortedArray[i] = array[i];
		}

		boolean flag = true;
		int temp;

		while (flag) {
			flag = false;
			for (int i = 0; i < sortedArray.length - 1; i++) {
				if (sortedArray[i] < sortedArray[i + 1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;
				}
			}
		}

		return sortedArray;
	}

}

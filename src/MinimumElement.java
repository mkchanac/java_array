import java.util.Scanner;

public class MinimumElement {

	
	public static void main(String[] args) {
		int elements = readInteger();
		int[] array = readElements(elements);
		System.out.println(findMin(array));
	}

	private static int readInteger() {
		int elements;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elements you need to enter? ");
		elements = scanner.nextInt();
		return elements;
	}

	private static int[] readElements(int elements) {
		int[] array = new int[elements];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter integer #" + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}
		return array;
	}

	private static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}

		return min;
	}

}

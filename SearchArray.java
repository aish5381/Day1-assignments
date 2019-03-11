import java.util.Scanner;

public class SearchArray {
	public static Scanner scanner = new Scanner(System.in);
	public static int number;
	public static int count = 0;

	public static void main(String[] args) {
		SearchArray searchArray = new SearchArray();
		searchArray.Search();
	}

	public void Search() {

		int[] givenArray = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		System.out.println("Enter the number");
		number = scanner.nextInt();
		for (int i = 0; i < givenArray.length - 1; i++) {
			if (givenArray[i] == number) {
				count++;
			}

		}
		if (count != 0) {
			System.out.println("Element " + number + " found at index " + count);
		} else {
			System.out.println("Element " + number + " does not exist in given Array");
		}
	}
}

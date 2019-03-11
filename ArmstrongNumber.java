import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {

	static Scanner sc = new Scanner(System.in);
	static int digit;
	static int temp;

	public static void main(String[] args) {
		ArmstrongNumber as = new ArmstrongNumber();
		System.out.println("Enter the number");
		digit = sc.nextInt();
		as.calculate(digit);
	}

	int order(int number) {
		temp = 0;
		while (number != 0) {
			temp++;
			number = number / 10;

		}

		return temp;
	}

	public void calculate(int x) {
		int n = order(digit);
		int temp = digit, sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = (int) (sum + Math.pow(r, n));
			temp = temp / 10;
		}
		if (sum == x) {
			System.out.println("Is a Armstrong number");
		} else {
			System.out.println("Not a Armstrong number");
		}
	}

}

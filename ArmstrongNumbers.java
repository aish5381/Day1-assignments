import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumbers {
	static Scanner sc = new Scanner(System.in);
	static int i;
	static int temp;

	public static void main(String[] args) {
		ArmstrongNumbers as = new ArmstrongNumbers();
		for(i=100;i<=999;i++)
		{
		as.calculate(i);
		}
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
		int n = order(i);
		int temp = i, sum = 0;
		
		while (temp != 0) {
			int r = temp % 10;
			sum = (int) (sum + Math.pow(r, n));
			temp = temp / 10;
		}
		if (sum == x) {
			System.out.println(i+" Is a Armstrong number");
		} else {
			System.out.println(i+ " Not a Armstrong number");
		}
	}

}


import java.util.Scanner;

public class LoginAttempts {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		LoginAttempts attemp = new LoginAttempts();
		attemp.attempts();
	}

	public void attempts() {
		String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
		System.out.println("Enter the username");
		String userName = scanner.nextLine();
		System.out.println("Enter the password");
		String password = scanner.nextLine();
		if (!password.matches(regex)) {
			System.out.println("Password criteria not matched");
			System.exit(0);
		}

		int attempt = 3;

		while (attempt != 0) {

			System.out.println("Enter the username to re-login");
			String userNameCheck = scanner.nextLine();
			System.out.println("Enter the password");
			String passwordCheck = scanner.nextLine();
			if (userName.matches(userNameCheck) && password.matches(passwordCheck)) {
				System.out.println("Login Successful!!!\n Welcome "+userName);
				System.exit(0);
			}

			else {
				System.out.println("Incorrect Login");
				attempt--;
			}

		}

		if (attempt == 0) {

			System.out.println("Reached maximum attempts!!! Please contact Admin");
		}
	}

}

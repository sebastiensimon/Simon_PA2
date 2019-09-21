package problem01;
import java.util.Scanner;

  class Decryptor {

	 public void decrypt() {
		// create a Scanner object to read user input
		Scanner in = new Scanner(System.in);

		// read a 4 digit integer from the user
		System.out.print("Enter a 4 digit number: ");
		int digits = in.nextInt();

		// make sure that is is valid 4 digit integer only
		while (digits < 1000 || digits > 9999) {
			System.out.print("Enter a valid 4 digit number: ");
			digits = in.nextInt();
		}

		// extract the individual digits separately
		int digit1 = digits / 1000;
		int digit2 = (digits / 100) % 10;
		int digit3 = (digits / 10) % 10;
		int digit4 = digits % 10;

		// add 7 to all digits and accept the remainder when dividing by 10
		digit1 = digit1 + 10 - 7;
		digit2 = digit2 + 10 - 7;
		digit3 = digit3 + 10 - 7;
		digit4 = digit4 + 10 - 7;

		// display the result after swapping the digits
		System.out.printf("Decrypted integer is: %d%d%d%d\n", digit3, digit4, digit1, digit2);

		in.close();
	}

}
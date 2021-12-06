import java.util.Scanner;

public class sample2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any word");
		String s = scan.nextLine();
		scan.close();

		String[] s1 = s.split("");
		String reverseString = "";

		for (int i = s1.length - 1; i>=0; i--) {

			reverseString = reverseString+s1[i];
		}

		System.out.println(reverseString);

		if (s.equals(reverseString)) {
			System.out.println("Palin");
		} else {
			System.out.println("not palin");

		}

	}
}

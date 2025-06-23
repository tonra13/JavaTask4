package JavaTask_4;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = s.nextLine();

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0; i < cleaned.length() / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(cleaned.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

	}

}

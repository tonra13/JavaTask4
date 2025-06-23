package JavaTask_4;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = s.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

	}

}

package JavaTask_4;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        long num1 = s.nextLong();

        System.out.print("Enter second number: ");
        long num2 = s.nextLong();

        System.out.print("Enter third number: ");
        long num3 = s.nextLong();

        long largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);

	}

}

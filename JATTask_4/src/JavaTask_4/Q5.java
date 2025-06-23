package JavaTask_4;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = s.nextInt();

        if (marks > 100 || marks < 0) {
            System.out.println("Invalid Input");
        } else if (marks == 100) {
            System.out.println("Your grade is S");
        } else if (marks >= 90) {
            System.out.println("Your grade is A");
        } else if (marks >= 80) {
            System.out.println("Your grade is B");
        } else if (marks >= 70) {
            System.out.println("Your grade is C");
        } else if (marks >= 60) {
            System.out.println("Your grade is D");
        } else if (marks >= 50) {
            System.out.println("Your grade is E");
        } else {
            System.out.println("Your grade is F");
        }

	}

}

package JavaTask_4;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        int month = s.nextInt();

        float rentPerDay = s.nextFloat();

        int numberOfDays = s.nextInt();

        boolean isPeakSeason;
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                isPeakSeason = true;
                break;
            default:
                isPeakSeason = false;
        }

        if (isPeakSeason) {
            rentPerDay += rentPerDay * 0.2f; 
        }

        float totalTariff = rentPerDay * numberOfDays;

        System.out.printf("%.2f\n", totalTariff);

	}

}

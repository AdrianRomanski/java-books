package java_basics.chapter_2;

import java.util.Scanner;

public class Retirement2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("How much you are going to put on bank account every year");
        var payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        var interestedRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        do {
            balance += payment;
            var interest = balance * interestedRate / 100;
            balance += interest;
            year++;

            System.out.printf("After %d years you will have %,.2f%n", year, balance);

            System.out.println(" You want retire?");
            input = in.next();
        }
        while(input.equals("No"));
    }
}


package java_basics.chapter_2;

import java.util.Scanner;

public class Retirement {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("How much do you need to retire?");
        var goal = in.nextDouble();

        System.out.println("How much you are going to put on bank account every year");
        var payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        var interestedRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        while (balance < goal) {

            balance += payment;
            var interest = balance * interestedRate / 100;
            balance += interest;
            year++;
        }
        System.out.println("You can go retirement in " + year + " years");
    }
}

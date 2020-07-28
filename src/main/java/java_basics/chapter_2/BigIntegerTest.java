package java_basics.chapter_2;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers winner need?");
        var k = in.nextInt();

        System.out.println("How many numbers in lottery?");
        var n = in.nextInt();

        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(
                    BigInteger.valueOf(i));

            System.out.println("You chances are 1 to " + lotteryOdds + " Good luck!");
    }


}

package java_basics.chapter_2;

import java.util.Arrays;

public class CompoundInterest {

    public static void main(String[] args)
    {
        final double STARTRATE = 10;
        // Change this one for bigger interest rate values range
        final int NRATES = 10;
        final int NYEARS = 10;

        // Setting interested rate from 10 % to 15 %
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;

        double[][] balances = new double[NYEARS][NRATES];

        // Filling with value - 10 000 for starting balance
        Arrays.fill(balances[0], 10000);

        // Counting interest for future years
        for (int i = 1; i < balances.length; i++)
        {
            for (int j = 0; j < balances[i].length; j++)
            {

                double oldBalance = balances[i - 1][j];


                double interest = oldBalance * interestRate[j];


                balances[i][j] = oldBalance + interest;
            }
        }

        for (double v : interestRate) {
            System.out.printf("%9.0f%%", 100 * v);
        }
        System.out.println();

        for (double[] row : balances)
        {
            for (double b : row)
                System.out.printf("%10.2f", b);

            System.out.println();
        }
    }
}

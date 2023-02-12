/*Account Balance */

import java.util.Scanner;
public class project1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your current balance in your savings account? \n(Please enter 1000.00) ");
        double startingBalance = scan.nextDouble();

        System.out.println("How much have you deposited into your account? \n(Please enter 500.00) ");
        double amountDeposited = scan.nextDouble();

        System.out.println("How much have you withdrawn from your account? \n(Please enter 100.00) ");
        double amountWithdrawn = scan.nextDouble();

        System.out.println("What is the current monthly interest rate on your account? \n(Please enter .02) ");
        double interest = scan.nextDouble();

        double finalBalance1=startingBalance+amountDeposited;
        double finalBalance2=finalBalance1-amountWithdrawn;
        double finalBalance3=finalBalance2*interest;
        double endingBalance=finalBalance2+finalBalance3;
        System.out.printf("Your ending balance will be: $%.2f", endingBalance);


    }
}
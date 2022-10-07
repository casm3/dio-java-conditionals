/**
 * Author: Carlos Melo
 */
package src;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double balance;
        double withdraw;

        System.out.print("Enter with your current balance: ");
        balance = scan.nextDouble();

        System.out.print("How much do you like to withdraw? ");
        withdraw = scan.nextDouble();

        String result = checkFunds(withdraw, balance);
        System.out.println(result);

    }
    protected static String checkFunds(double withdraw, double balance){
        return withdraw <= balance ? String.valueOf(balance -= withdraw) :
                "You can't withdraw more than you have.";
    }
}

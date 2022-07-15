//Account Balance

import java.util.Scanner;
public class Account {
    private static int account_balance = 100;
    static Scanner sc = new Scanner(System.in);

    //Method to withdraw money
    static class Withdraw{
        public static void main(String[] args) {
            int amount;
            System.out.println("Enter Amount You Want To Withdraw");
            amount=sc.nextInt();
            if (account_balance>=amount){
                account_balance=account_balance-amount;
                System.out.println("Balance after withdraw: "+account_balance);
            }else{
                System.out.println("Your Balance is less: ");
            }


        }


    }




}

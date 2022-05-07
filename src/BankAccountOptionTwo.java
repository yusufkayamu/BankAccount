import java.util.Scanner;

public class BankAccountOptionTwo {
    public static void main(String[] args) {
        String U, P;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {

            System.out.print("Username=");
            U = input.nextLine();

            System.out.print("Password=");
            P = input.nextLine();

            if (U.equals("PatikaDev") && P.equals("123456789")) {
                System.out.println("Login Successful");
                System.out.println("-------------------------------");
                System.out.println("Welcome the national bank");

                do {
                    System.out.println(" 1-Checking the balance\n 2-deposit money\n 3-withdraw money\n 4-Log out of the system\n");
                    System.out.println("Select the action you want to do");
                    select = input.nextInt();
                    switch (select) {
                        case (1):
                            System.out.println("Your balance =" + balance);
                            break;

                        case (2):
                            System.out.println("Amount of money =");
                            int deposit = input.nextInt();
                            balance += deposit;
                            break;

                        case (3):
                            System.out.println("Amount of money");
                            int withdraw = input.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Your money is not enough for this action");
                            } else {
                                balance -= withdraw;
                            }
                            break;

                    }
                } while (select != 4);
                {
                    System.out.println("Goodbye the next time");
                    break;

                }
            } else {
                right--;
                System.out.println("Login fail , Please try again , Number of rights =" + right);
                if (right == 0) {
                    System.out.println("Your bank account is blocked");
                }

            }
        }
    }
}





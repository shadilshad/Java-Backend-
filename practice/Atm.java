package practice;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;

        // username = admin
        // password = admin@123
        // hey

        do {
            System.out.print("Username: ");
            String username = sc.nextLine().toLowerCase();

            System.out.print("Password: ");
            String password = sc.nextLine().toLowerCase();

            if (username.equals("admin")) {
                if (password.equals("admin@123")) {
                    System.out.println("Logged in Successfully!");
                                       loggedIn = true;  
                } else {
                    System.out.println("Invalid password");
                }
            } else {
                System.out.println("Invalid Username");
            }

        } while (!loggedIn);


        boolean exit = false;

        while(!exit){
            System.out.println("Menu: \nCheck Balance \nDeposit \nWithdraw \nExit \nChoose An Action: ");
            String actions = sc.nextLine();
            if(actions.equalsIgnoreCase("Check Balance")){
               System.out.println("You got zero rupees in your bank");}


            else if(actions.equalsIgnoreCase("Deposit")){
                System.out.print("Enter Amount: ");
                int amount = sc.nextInt();
                if(amount!=50000){
                   System.out.println("maximum you can deposit this amount on this day: "+ (amount-50000));
                }
                else{
                    System.out.println("The limit has reached");
                }
            }


            else if(actions.equalsIgnoreCase("Withdraw")){
                System.out.print("Enter Amount: ");
                int withdraw = sc.nextInt();
                sc.nextLine();
                if(withdraw!=50000){
                System.out.println("maximum you can withdraw on this day: "+ (withdraw-50000));
                }
                else{
                    System.out.println("The limit has reached");
                }
             }

             else if(actions.equalsIgnoreCase("exit")){
                exit = true;
                System.out.println("Have a nice day");
             }

             else{
                System.out.println("Invalid action!");
             }
        }

        sc.close();
    }
}
 
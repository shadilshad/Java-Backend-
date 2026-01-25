package practice;
import java.util.Scanner;

public class Atm2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a pin : ");
        int balance = 20000;
        int pin = sc.nextInt();
        int PIN = 131105;
        if(PIN==pin)
        {
            System.out.println("allow access");
            while(true)
        {
            System.out.println("ATM MENU");
            System.out.println("1.check balance");
            System.out.println("2.deposit");
            System.out.println("3. withdraw");
            System.out.println("4.exit");
            System.out.println("Enter your choice :");
            int choice = sc.nextInt();

            if(choice == 1){
                System.out.println("Balance :" + balance);

            } else if (choice==2)
            {
                System.out.println("Enter a amount to deposit :");
                
                int amt = sc.nextInt();
                balance = balance + amt;
                System.out.println("Amount deposited");
                System.out.println(balance);
            }
            else if (choice==3)
            {
                System.out.println("Enter a amount to withdraw :");
                int amt = sc.nextInt();
                if(balance<=amt){
                balance = balance - amt;
                System.out.println("please collect ur cash");
                System.out.println(balance);
                }
                else{
                    System.out.println("Insufficient balance");
                }
            }else if (choice == 4){
                System.out.println("Thank u for using our ATM");
                break;
            }
            else{
                System.out.println("Invalid choice");
            }


            }
            sc.close();

        }
        
        else{
            System.out.println("wrong pin");
        }
        
    }

    
}

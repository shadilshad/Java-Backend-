package practice;
import java.util.Scanner;
import java.util.Random;

public class random {
    public static void main(String[] args) {
        
        Random generator = new Random();
        int secretnumber = generator.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int Guess = sc.nextInt();

        int attempts = 1;
        while(Guess!=secretnumber)
        {
            if (Guess>secretnumber)
            {
                System.out.println("Too high ra kanna");
            }
            else{
                System.out.println("bitch too low look higher");
            }
            System.out.println("Try again love");
            System.out.println("Enter a number to guess :");
            Guess = sc.nextInt();
            attempts++;
        }
        System.out.println("yyyyyou got this awwwwwww in "+ attempts+ " attempts");
    }
    
}
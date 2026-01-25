package practice;
import java.util.Scanner;
import java.util.Random;
public class Numberguess {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(1,101);
        int guess = 0;
        int attempts = 0;
        System.out.print("Guess a number in between 1 to 100 ");

        while(guess != number){
        guess = sc.nextInt();
        attempts ++ ;

        if(guess> number){
            System.out.println("your guessed number is higher");
        }
        else if(guess<number){
            System.out.println("your guessed number is smaller");
        }
        else{
            System.out.println("You guessed it right");
            System.out.println("Attempts: " + attempts);
            break;
        }
    }
        sc.close();
    }
    
}

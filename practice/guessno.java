package practice;
import java.util.Random;
import java.util.Scanner;

public class guessno{
    public static void main(String[] args) {
        
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Guess a number in between 1-50\n");
        int rand = ran.nextInt(1,51);
        int guess;


        do{
            System.out.print("Take a guess: ");
            guess = sc.nextInt();
            if(guess > rand){
                System.out.println("ningal guess cheytha number, thannitulla numberinekkaal valudhaann!");
            }
            else if(guess < rand){
                System.out.println("Cheruthaann!");
            }
            else{
            System.out.println("HUrreyyy! the right number is " + rand);
            }
        }
        while(guess != rand);

    }
}
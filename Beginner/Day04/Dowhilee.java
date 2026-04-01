import java.util.Scanner;
import java.util.Random;
public class Dowhilee {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        Random ran = new Random();
        System.out.println("Its gonna be a random number guess");
        int number = ran.nextInt(1,11);
        int guess;
        do{
           System.out.print("Enter the guessed number: ");
           guess = sc.nextInt();


        }while(number != guess);
         System.out.println("Yes you guessed the right one, " + number);
        
        
        sc.close();
    }
}

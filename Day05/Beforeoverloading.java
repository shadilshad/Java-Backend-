package Day05;
import java.util.Scanner;
import java.util.Random;

public class Beforeoverloading {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        String answer;

        // keep asking until input is YES or NO
        do {
            System.out.print("Do you want me to guess a number? (YES/NO): ");
            answer = sc.nextLine();

            if(!answer.equalsIgnoreCase("YES") && !answer.equalsIgnoreCase("NO")){
                System.out.println("Invalid input. Please type YES or NO.\n");
            }

        } while(!answer.equalsIgnoreCase("YES") && !answer.equalsIgnoreCase("NO"));

        // valid input reached here
        if(answer.equalsIgnoreCase("YES")){
            int guess = ran.nextInt(1, 11);
            System.out.printf("I guessed %d 😄\n", guess);
        }
        else{
            System.out.println("Alright, maybe next time 👍");
        }
    }
}

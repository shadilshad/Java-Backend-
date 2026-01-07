import java.util.Scanner;
import java.util.Arrays;
public class dowhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list = {"banana" ,"apple", "orange", "pomegranate", "grapes"};
        String fruit= "banana";
        System.out.println("Guessing Name Starts here.");
        String guess;
        do{
            System.out.print("Guess the fruit from this list " + Arrays.toString(list));
            guess =  sc.nextLine();
        }
        while(!guess.equalsIgnoreCase(fruit));
        System.out.println("Wow, you guessed them well");
    }
}

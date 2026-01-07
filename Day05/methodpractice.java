package Day05;
import java.util.Scanner;
public class methodpractice {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Write a number that needs to be squared: ");
            int square = sc.nextInt();
            System.out.print("Wanna find cube value? Enter a value: ");
            int cube = sc.nextInt();
            System.out.printf("The squared value is %d \n", Squared(square));
            System.out.printf("The cube value is %d \n", Cubed(cube));


    } 

      static int Squared(int square){
        return square*square;
      }
      static int Cubed(int cube){
        return cube*cube*cube;
      }
}

import java.util.Scanner;
public class Guessmiss{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Today, I ___ to school");
        String part = " ";
        while(!part.equalsIgnoreCase("Went")){
            System.out.print("Write the missing part: ");
            part =  sc.nextLine();
            if(!part.equalsIgnoreCase("went")){
                System.out.println("Try again");
            }
            else{
                System.out.println("great work");
            }
        }
    }
}
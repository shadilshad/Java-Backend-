import java.util.Scanner;
public class Logicaloperators {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String username;
        System.out.print("Enter your username: ");
        username = sc.nextLine();
        if(username.length()<4 || username.length()>10){
            System.out.println("username must be between 4 to 12 characters");

        }
        else if(username.contains(" ") || username.contains("_"))
            {
           System.out.println("username must not contain space or underscore");
        }
        else{
            System.out.println("Welcome to the page, " + username);

        }
        sc.close();
    }
}

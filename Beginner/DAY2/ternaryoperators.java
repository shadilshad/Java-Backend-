import java.util.Scanner;
public class ternaryoperators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Whats your score? ");
        int marks = sc.nextInt();
        String Passfail = (marks>=50) ? "PASS" : "FAIL";
        System.out.print("You are "+ Passfail);
        sc.close();
    }
    
}

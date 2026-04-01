import java.util.Scanner;
public class Substringg{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Write your Email ID: ");
        String email =sc.nextLine();
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@"));
        email = email.trim();
        System.out.println(username);
        System.out.println(domain);
        sc.close();
    
    }
    
}

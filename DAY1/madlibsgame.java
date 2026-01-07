import java.util.Scanner;
public class madlibsgame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Today i went to a ____  zoo");
        sc.nextLine();
        System.out.println("write the missing part: ");
        String miss = sc.nextLine();
        System.out.println("Today i went to a " + miss +" zoo");
        sc.close();
    }
}

import java.util.Scanner;
public class Shabna{
           public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x;
            int y;          
              System.out.print("Whats the value of X? ");
            x = sc.nextInt();
            System.out.print("Whats the value of Y? ");
            y = sc.nextInt();
            int z = x*y;
            System.out.print("so, "+ x+ " X "+y+" = "+z);

           }
}
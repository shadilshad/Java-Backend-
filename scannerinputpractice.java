import java.util.Scanner;
public class scannerinputpractice{
    public static void main(String[] args) {
         
        //Multiplication

        int x = 0;
        int y=0;

        Scanner sc =  new Scanner(System.in);
        System.err.println("What is X? ");
        x = sc.nextInt();
        System.err.println("What is Y? ");
        y = sc.nextInt();
        int z = x*y;
        System.out.println("So, the " + x + " X " + y + " = " + z );
    }
}
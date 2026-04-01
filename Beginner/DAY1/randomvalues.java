import java.util.Random;
import java.util.Scanner;
public class randomvalues{
    public static void main(String []args){
        Random ran = new Random();
        int value = ran.nextInt(1, 8);
        System.out.println(value);

        boolean heads = ran.nextBoolean();
        if(heads){
        System.out.println("heads");
        }
        else{
            System.out.println("Tail");
        }
        int x=0;
        Scanner sc = new Scanner(System.in);
        System.err.println("write a number");
        x = sc.nextInt();
        System.out.println("The written number is "+x);
        sc.nextLine();
        int z = value*x;
        System.out.println("multiplied with random number: " + value + " X " + x + " = "+ z);



    }
}
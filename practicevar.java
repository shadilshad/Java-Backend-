import java.util.Scanner;
public class Practicevar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you ? ");
        int age = sc.nextInt();
        System.out.println("whats your salary?");
        double salary = sc.nextDouble();
        if(age>=21 && salary>=20000){
            System.out.println("You are Eligible");
        }
        else if(age<=19 && salary<=19000){
            System.out.println("Soon you will be eligible ");
        }
        else if(age<=18 && salary<=10000){
            System.out.println("No, bro. you aint eligible");
        }
        else{
            System.out.println("dont look at here bro");
        }
    }
}
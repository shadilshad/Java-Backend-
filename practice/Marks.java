package practice;
import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Check your CGPA! \n");
        int se;
        int cd;
        int op;
        int os;
        int dbms;
        do{
            System.out.println("Write your marks in Software Engineering: ");
            se = sc.nextInt();
            System.out.println("Write your marks in Compiler Designer: ");
            cd = sc.nextInt();
            System.out.println("Write your marks in OOPS in Java: ");
            op = sc.nextInt();
            System.out.println("Write your marks in Operating System: ");
            os = sc.nextInt();
            System.out.println("Write your marks in DBMS: ");
            dbms = sc.nextInt();
            sc.nextLine();
            int total = se+cd+op+os+dbms;
            double average =(double) total/500;
            double perc = (double) average*100;
           // int cgpa = marks
            
            System.out.printf("you got %.2f  \n" ,perc);
            System.out.println("Do u wanna exit? (YES/NO) ");
            String yes = sc.nextLine();
            if (yes.equalsIgnoreCase("yes")) {
                System.out.println("Nice to meet you!");
                break;
            } else {
                System.out.println("Aight. Let's continue\n");
            }

        }while(true);
    }
}

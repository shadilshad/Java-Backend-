package Unstoppable;
import java.util.Scanner;
public class Conditional {
    int x ; String name;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Conditional cn = new Conditional();
        System.out.print("Whats your name? ");
        cn.name = sc.nextLine().toLowerCase();
        if(cn.name.equalsIgnoreCase("shadil")){
            System.out.println("Our King is here!"); }
        else if(cn.name.equalsIgnoreCase("ceko")){
            System.out.println("The Great Shadil !!"); }
        else{
            System.out.println("Wait, who are you?");}
            System.out.print("Pick a number in between 1-3: ");
        cn.x = sc.nextInt(); sc.nextLine();
        switch(cn.x){
            case 1 : System.out.println("Great Shadil");
            break;
            case 2 : System.out.println("Great Shadileeee");
            break;
            case 3 : System.out.println("Shadileee");
            break;
            default: System.out.println("Invalid !");
        }

    }
    
}

package practice;
import java.util.Scanner;
public class umpavam {
    public static void main(String[] args) {
        
    
    int x;
    int y;
    String choice;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number X: ");
    x =sc.nextInt();
    System.out.print("Enter the number Y: ");
    y = sc.nextInt();
    sc.nextLine();

    int z = x + y;
    int a = x - y;
    int b = x * y;
    double c =(double) x / y ;

    System.out.print("Which action do you wanna perform? (Pick the exact one + , - , x , / ) ");
    choice = sc.nextLine();


    if(choice.equals("+")){
        System.out.printf("%d + %d = %d",x,y,z);
    }
    else if(choice.equals("-")){
    System.out.printf("%d - %d = %d",x,y,a);
    }
    else if(choice.equalsIgnoreCase("x")){
        System.out.printf("%d x %d = %d",x,y,b);
    }
    else if(choice.equalsIgnoreCase("/")){
    if(y == 0){
        System.out.println("Cannot divide by zero!");
    } else {
        System.out.printf("%d / %d = %.2f", x, y, c);
    }
    }
    else{
        System.out.println("Invalid Actions!");
    }

    sc.close(); 
    
}
}
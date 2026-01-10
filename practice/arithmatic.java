package practice;
import java.util.Scanner;
public class arithmatic {
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

    do{
    System.out.print("Which action do you wanna perform? (Pick the exact one + , - , x , / ) or type 'exit' to quit: ");
    choice = sc.nextLine();


    if(choice.equals("+")){
        System.out.printf("%d + %d = %d\n",x,y,z);
    }
    else if(choice.equals("-")){
    System.out.printf("%d - %d = %d\n",x,y,a);
    }
    else if(choice.equalsIgnoreCase("x")){
        System.out.printf("%d x %d = %d\n",x,y,b);
    }
    else if(choice.equalsIgnoreCase("/")){
    if(y == 0){
        System.out.println("Cannot divide by zero!\n");
    } else{
        System.out.printf("%d / %d = %.2f\n", x, y, c);
    }
    }
    else{
        System.out.println("Invalid Actions!\n");
    }
}while(!choice.equalsIgnoreCase("Exit"));
   System.out.println("Thanks for playing with us!");
    sc.close(); 
}
}
package Unstoppable;

import java.util.Scanner;

public class Operators {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
             
        System.out.print(" Multiplication of which number? ");
        int number = sc.nextInt();
        sc.nextLine();
        
            for(int i=0; i< 11; i++){
                System.out.println(number + " X " + i + " = " + number*i  );
            }

        System.out.println("Find Odd or Even Number");
        System.out.println("Choose a Number");
        int val = sc.nextInt();
        if(val % 2 == 1 ){
            System.out.println("The given number is an odd number");
        }
        else{
            System.out.println("The given number is an even number");
        }
        
    sc.close();

}
    
}

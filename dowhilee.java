import java.util.Scanner;
    public class Dowhilee{
           public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a value below 20: ");
            int m = sc.nextInt();

            do{
                if(m<20){
                System.out.println("the next number "+m+" for reaching to 20" );
                }
                else if(m==20){
                System.out.println("thats the same number "+m+" as 20" );
                }
                else{
                    System.out.println("Invalid Numbers");
                }
                m++;
            }
            while(m<=20);
           }
    }

    

import java.util.Scanner;
public class Whileee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Guess the weekday");
        String name = sc.nextLine();
        
        while(!name.equalsIgnoreCase("monday")){
            if(!name.equalsIgnoreCase("monday")){
            System.out.println("Try guessing again");
            name = sc.nextLine();}

            else{
                System.out.println("Grest guess! right");
            }
        }
        sc.close();
    }
}
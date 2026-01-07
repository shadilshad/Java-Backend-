import java.util.Scanner;
import java.util.Random;
public class project1gpt1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Great. Whats your good name? ");
        String names = sc.nextLine();


        System.out.print("Write your Username: ");
        String username = sc.nextLine().trim();
        System.out.print("Write your Password: ");
        String password = sc.nextLine().trim();

        if(username.equalsIgnoreCase("student123")){
            if(password.equalsIgnoreCase("java@123")){
                System.out.println("Login Sucessfully");
                sc.nextLine();
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        if(marks==100){
            System.out.println("YOU RECIEVED O GRADE");
        }
        else if(marks>=90){
            System.out.println("YOU RECIEVED A GRADE");
        }
        else if(marks>=75){
            System.out.println("YOU RECIEVED B GRADE");
        }
        else if(marks>=60){
            System.out.println("YOU RECIEVED C GRADE");
        }
        else if(marks>=35){
            System.out.println("YOU RECIEVED D GRADE");
        }
        else{
            System.out.println("SORRY, YOU ARE FAILED!");
            sc.nextLine();
            System.out.println("Lets check your luck and see how many times you have to write imposition");
            sc.nextLine();
            System.out.println("Are you ready? (YES/NO)");
            String imp = sc.nextLine();
            if(imp.equalsIgnoreCase("YES")){
                System.out.println("Great");
            }
            else{
                System.out.println("You have to do it anyways LOL");
            }
            sc.nextLine();
            int im = ran.nextInt(1,11);
            System.out.println("You have to write imposition for " + im + " times!");

        }
         
        sc.nextLine();
        System.out.print("lets go to the next session? (YES/NO)");
        String step = sc.nextLine();
        if(step.equalsIgnoreCase("yes")){
           System.out.printf("Alright, %s  lets move on", names);
        }
        else{
            System.out.printf("Alright! Thats it");
        }
        
        sc.nextLine();
        System.out.println("HAHA THERE'S NOTHING MORE!");

            }
            else{
                System.out.println("Invalid Password");
            }
        }
        else{
            System.out.println("Invalid Username");
        }
    
      System.out.println("Great to meet you, " + names);
     sc.close();
    }


}

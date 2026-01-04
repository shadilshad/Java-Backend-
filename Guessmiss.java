import java.util.Scanner;
public class Guessmiss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("I ___ to school");
        sc.nextLine();
        System.out.print("Write the missing part: ");
        String part = sc.nextLine().toLowerCase();
        if(part.equals("went")){
            System.out.println("RIGHT! WELL DONE");
        }
        else{
            System.out.println("Sorry, its wrong!");
        }
        sc.close();

    }
}

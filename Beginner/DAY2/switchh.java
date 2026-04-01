import java.util.Scanner;
public class switchh {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.print("What day is it? ");
        String day = sc.nextLine().trim();
        switch(day.toLowerCase()){
            case "monday", "tuesday" -> System.out.println("Ahh again school");
            case "wednesday" -> System.out.println("finally color dress in school");
            case "thursday" -> System.out.println("few more days to go to be weekends");
            case "friday" -> System.out.println("woah, i am so happy!");
            case "saturday" -> System.out.println("Heavenly day woah");
            case "sunday" -> System.out.println("ehm the next day we got school");
            default -> System.out.println("Ah unfortunately, its not a day, u dummy!");
            
        }
        sc.close();
        }
    
}

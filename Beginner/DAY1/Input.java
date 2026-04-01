import java.util.Scanner; /*class scanner */
public class Input{
    public static void main(String[] args) {
         Scanner sc =  new Scanner(System.in); /*sysem . in ullil kodkkannam! */
          
         System.out.print("Whats your name? ");
         String name =  sc.nextLine(); /*next line used for string */
         System.out.println("Hey, " + name + " Welcome to Shadil's project!");
         System.out.print("How old are you? ");
         int age = sc.nextInt(); /*next int used for int */
         if(age==18){
            System.out.println("Oh you are an adult");
         }
         else if(age<=17){
            System.out.println("You are a kid");
         }
         else{
            System.out.println("You are an annachi");
         }
        System.out.println("Whats your percentage in 7th? ");
        double cgpa = sc.nextDouble(); /*next double used for double */
        System.out.println("WOW " + cgpa);

         
        System.out.print("Are you a student? (true/false) ");
        boolean enrolled = sc.nextBoolean(); /*next boolean used for boolean */
        if(enrolled){
        System.out.println("You are enrolled");
        }
        else{
        System.out.println("You are not enrolled");
        }



         sc.close();


    }
}
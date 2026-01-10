package practice;
import java.util.Scanner;
public class day01 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name;
        int age;
        String memb;

        System.out.print("Whats your name? ");
        name = sc.nextLine().toUpperCase();

        System.out.print("Whats your age? ");
        age = sc.nextInt(); 
        sc.nextLine();

        System.out.print("Do you have membership here? (YES/NO) ");
        memb = sc.nextLine().toUpperCase();

        System.out.println("The user's name is "+name);
        System.out.println("The user's age is "+age);
        System.out.println(memb.equalsIgnoreCase("yes")
        ? "the user has membership" : "the user doesnt have membership");

        String[] products = {"Banana","apple","vegetables","coconut","powder"};
        String[] price = {"$10","$20","$20","$11","$23"};
        String[] token = {"1","2","3","4","5"};
        String[][] shop = {token, products, price};



        //or 
        System.out.println("The available products");

        for(int i=0 ; i < token.length ; i++ ){
            System.out.println(shop[0][i] + " - " + shop[1][i]+" : "+ shop[2][i]);
        }


       ArrayList<String> chosenproducts = new ArrayList<>();
       ArrayList<Integer> quanities = new ArrayList<>();
       
       while(true){
        System.out.println("Pick your products (Type 'STOP' for stoping it)");
        String choose = sc.nextLine().toUpperCase();
        
        if(choose.equalsIgnoreCase("STOP")){
            break;
        }

        System.out.println("How many of them do you want?");
       }

        sc.close();
      }
    
}

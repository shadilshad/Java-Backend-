package Day05;
import java.util.Scanner;
public class Metho{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tell us about your name: ");
        String name = sc.nextLine();
        System.out.print("Tell about your age: ");
        int age = sc.nextInt();
        System.out.print("wanna multiply with 2? enter a number: ");
        int number = sc.nextInt();
        sc.nextLine();
        String Yes;
    do{
        System.out.print("wanna explore? Say NO: ");
        Yes = sc.nextLine();
    }while(!Yes.equalsIgnoreCase("NO"));

     list(name, Yes);
      int[] result = value(age, number);

      System.out.println(result[0]);
      System.out.println(result[1]);  
    }
    public static void list(String name, String Yes){
    System.out.printf("so this guy, %s comes from Kerala \n", name);
    if(Yes.equalsIgnoreCase("No")){
    System.out.println("He is a Good boy");
    }
    else{
    System.out.print("Bad boy");
    }
}
    public static int[] value(int age, int number){
        return new int[]{age, number*2};
    }

}
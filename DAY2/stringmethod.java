import java.util.Scanner;
public class stringmethod {
    public static void main(String[] args) {
        



        Scanner sc = new Scanner(System.in);
        System.out.print("write shit: ");
        String name = sc.nextLine();
        System.out.println("the given shit is " + name);

        int length = name.length();
        System.out.println(length +" letters");

        String uppercase = name.toUpperCase();
        System.out.println("the uppercase is " + uppercase);

        String lowercase =  name.toLowerCase();
        System.out.println("the lowercase is " + lowercase);

        String change = name.replace("a", "o");
        System.out.println("the replaced one: " + change);

        char letter = name.charAt(2);
        System.out.println("the character at the third position is: " + letter);

        String name2= "shadil vadakke veetil";
        name2= name2.trim();
        System.out.println(name2);
        int name3 = name.indexOf("d");
        System.out.println(name3);







        sc.close();




    }
    
}

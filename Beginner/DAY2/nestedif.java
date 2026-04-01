import java.util.Scanner;
public class nestedif {
    public static void main(String[] args) {
        
        String color;
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the color: ");
        color =  sc.nextLine();
        if(color.equals("red")){
            System.out.println("Oh right! its red.");
            if(color.length() == 3){
                System.out.println("Theres no way u found it");
            }
            else{
                System.out.println("I know right");
            }
            
        }
        else{
            if(color.equals("green")){
                System.out.println("how come green");
            }
            else{
                System.out.println("geez, nevermind");
            }
        }

        sc.close();
    }
}
//nested if
// string if l print aakumpo idh nokkende,  color.equals("color edhaan adh")
// ini length aanel, color.length()==3
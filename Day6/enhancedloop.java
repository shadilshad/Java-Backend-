package Day6;
import java.util.Arrays;
public class enhancedloop {
    public static void main(String[] args) {
        
        String[] fruits = {"Tomato "," apple "," Banana "};
        String[] meat = {" chicken " ," mutton ", " duck "};
        String[] vegetable={" Onion "," fish "};

         String[][] groceries = {fruits,vegetable,meat};
         
         for(String[] food : groceries){
            for(String list : food){
            System.out.print(list);
            }
         }
        }
    
}

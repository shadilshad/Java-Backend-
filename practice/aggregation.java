package practice;
import java.util.Arrays;
public class aggregation {
    public static void main(String[] args) {
        
        int[] price = {100,200,360,300,199};
        
        System.out.println("The price details are: n");

        for(int i = 0; i< price.length; i++){
            System.out.println(" "+ price[i]);
        }
        int total = 0;

        for(int product : price) total += product;
        System.out.println("Ufff: "+ total);


    }
    
}

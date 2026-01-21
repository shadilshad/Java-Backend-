package DSA;
import java.util.Scanner;
import java.util.Arrays;

public class arraysdsa {
    public static void main(String[] args){

        int[] number = {10,11,22,334,55};
        int[] number2 = new int[5];

        System.err.println(Arrays.toString(number));

        for(int i= 0 ; i < number.length ; i++){
            System.out.println(Arrays.toString(number));
        }

        for(int num : number){
            System.out.print(num + " ");
        }
    }
    
}

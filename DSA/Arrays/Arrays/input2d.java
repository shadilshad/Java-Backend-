package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class input2d {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] number =new int[4][4];
        


                for(int i = 0 ; i< number.length ; i++){
            for(int j = 0 ; j< number[i].length; j++){
                number[i][j] = sc.nextInt();
            }

                }

        for(int i = 0 ; i< number.length ; i++){
            for(int j = 0 ; j< number[i].length; j++){
System.out.print(number[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

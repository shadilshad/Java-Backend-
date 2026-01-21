package Arrays;
import java.util.Arrays;
public class Twodimension {

    public static void main(String[] args) {
        
        int[][] number = {
            {3, 5, 7, 9},
            {7, 9, 10, 22},
            {42, 44, 22, 33},
            {9, 34, 38, 33}
        };

        System.out.print(Arrays.deepToString(number));

        for(int i = 0 ; i< number.length ; i++){
            for(int j=0 ; j< number[i].length ; j++){
                System.out.print(number[i][j] + " ");
            }
                System.out.println();  

        }
    }
    
}

package Day6;
import java.util.Arrays;
import java.util.Scanner;
public class InputArrays {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] colors = new String[4];
             System.out.println("write any four colors: ");

        for(int i=0; i< colors.length; i++){
         colors[i] = sc.nextLine();
        }
        System.out.print("The given colors are " + Arrays.toString(colors));
        }
    

    }
    


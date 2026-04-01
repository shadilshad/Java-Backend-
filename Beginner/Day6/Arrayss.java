package Day6;
import java.util.Arrays;
public class Arrayss {
    public static void main(String[] args) {
        String[] colors = {" red "," blue "," violate "," maroon "," magenta "};
        //int number = colors.length;
        // System.out.println(number);
        // Arrays.fill(colors, " Orange ");
         //System.out.println(Arrays.toString(colors));

       Arrays.sort(colors);
        
    for(int i=0 ; i<colors.length; i++){
            System.out.print(colors[i]);
        }

    }
    
}

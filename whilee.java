import java.util.Scanner;
public class whilee{
    public static void main(String []args){
        Scanner sc =  new Scanner(System.in);

            int m= sc.nextInt();
        /* while (condition) {
    // code to repeat
}
 */
        while(m<=100){
            System.out.println("The value can be : " + m);
            m++;
        }
    }


}
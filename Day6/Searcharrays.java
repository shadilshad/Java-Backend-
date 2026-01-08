package Day6;
public class Searcharrays {
    public static void main(String[] args) {

        int[] number = {1,2,3,4,5,6,7,8,9};
        int num = 5;

        for (int i = 0; i < number.length; i++) {
            if (number[i] == num) {
                System.out.println( "Found you");
                break;
            }
            System.out.println(number[i]);
        }
    }
}

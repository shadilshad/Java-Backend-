import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args){
           
           int[] Numbers = {0,1,2,3,4,5,6};
           String[] Cars = {"Honda","Benz","Maruti Suzuki","Lexas"};

           System.out.println("The numbers that's given: " + Arrays.toString(Numbers));
           System.out.println("The given car names are: " + Arrays.toString(Cars));

           int[] roll_numbers = {142,135,156,178,190};
           System.out.println("Only specified roll number from the list is: " + roll_numbers[1]);
    }
}
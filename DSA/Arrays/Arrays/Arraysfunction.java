package Arrays;

import java.util.Arrays;

public class Arraysfunction{
    public static void main(String[] args){

        int[] number = {3,4,5,6,7};
        System.out.println(Arrays.toString(number));
        change(number);
        System.out.println(Arrays.toString(number));
    }
    static void change(int[] arr){
    arr[0]=99;
}
}

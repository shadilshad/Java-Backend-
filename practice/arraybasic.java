package practice;
import java.util.Arrays;
public class arraybasic {
    public static void main(String[] args) {
      int[] students = {40,33,29,40,34};
      System.out.println("Print all marks");
      for(int i=0 ; i < students.length; i++){
        System.out.println("Students " + (i+1)+": "+students[i]);
      }
    int total = 0;
    for(int mark : students){
       total += mark;
    }
    System.out.println("\nTotal: "+total);
    
    }
}

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class Practicehashandarray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> Student = new HashMap<>();
        Student.put("Raman", 10);
        Student.put("shadile", 20);

        for(String s : Student.keySet()){
            System.out.println(s +" got "+ Student.get(s)+ " mangoes!");
        }


        ArrayList<String> store = new ArrayList<>();
        store.add("shadoo~");
        for(String so : store){
            System.out.println("The person is "+ so);
        }
    }
}

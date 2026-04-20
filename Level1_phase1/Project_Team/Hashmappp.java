import java.util.HashMap;
import java.util.Scanner;
public class Hashmappp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Boolean repeat= true;
        HashMap<String, Integer> students = new HashMap<>();

        students.put("shadil ", 30);
        students.put("Raja ", 500);
        students.put("komali ", 400);

        for(String name : students.keySet()){
            System.out.println(name + "got " + students.get(name) + " backlogs!");
        }

do{
        System.out.println("Do you want to fetch the other data: (YES/NO)");
        String ask = sc.nextLine();

    if(ask.equalsIgnoreCase("yes")){
        HashMap<Integer, String> Days = new HashMap<>();

        Days.put(1, "Sunday");
        Days.put(2, "Monday");
        Days.put(3, "Tueday");
        Days.put(4, "Wednsday");
        Days.put(5, "Thursday");
        Days.put(6, "Friday");
        Days.put(7, "Saturday");
        Days.put(8, "Invalid");

        for(Integer day : Days.keySet()){
            System.out.println(day + "th day is actually " + Days.get(day));
        }

        repeat = false;
        }
        else if(ask.equalsIgnoreCase("no")){
            System.out.println("it was nice to meet you!");
            repeat =false;

        }
        else{
            System.out.println("Invalid Action! Try Again");
            repeat=true;
        }
    }
    while(repeat);
sc.close();
    }
}
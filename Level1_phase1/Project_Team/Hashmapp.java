import java.util.HashMap;

public class Hashmapp {
    public static void main(String[] args) {

        HashMap<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Shadil", 88);
        studentMarks.put("Rahul", 76);
        studentMarks.put("Aisha", 92);

        for (String name : studentMarks.keySet()) {
            System.out.println(name + " scored " + studentMarks.get(name));
        }
    }
}
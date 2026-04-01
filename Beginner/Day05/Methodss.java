package Day05;

// methods = a block of reusable codes thats excuted when its called

public class Methodss {
    public static void main(String[] args) {
        String name = "shadil";
        int age = 22;
        HappyBirthday(name, age);

      System.out.println(square(4));
      String names ="SHADIL VV";
      System.out.println(names);
    }

    static void HappyBirthday(String name, int age){
        System.out.println("Happy Birthday to you");
        System.out.printf("Happy Birthday %s \n", name);
        System.out.printf("You are %d years old now\n", age);
        System.out.println("Happy Birthday to you");
       
    }
    //return use aakunne
    static double square(double value){
        return value * value;
    }
    
    static String named(String names){
        return names;
    }
}

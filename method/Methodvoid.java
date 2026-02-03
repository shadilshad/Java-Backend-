package method;
public class Methodvoid {
    public static void main(String[] args) {   
        String name = "Shadil";
        int age = 22;
        char gender = 'M';
        hello(name, age, gender);
    }
    static void hello(String name, int age, char gender){
        System.out.printf("Hey y'all, My name is %s\n",name);
        System.out.printf("I am %d years old\n",age);
        System.out.println("I stand as "+ gender);
    }
    
}

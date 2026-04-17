public class ClassandObjectt {
    String name;
    int age;
    void info(){
        System.out.println("Hey "+ name + " Its nice to meet you in your " + age + "th age!");
    }
    

    public static void main(String[] args) {   
        ClassandObjectt co = new ClassandObjectt();
        co.name = "Shadil";
        co.age = 10;
        co.info();
    }

}

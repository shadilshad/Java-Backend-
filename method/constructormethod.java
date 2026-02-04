package method;

public class constructormethod {
public static void main(String[] args) {
    String wish = "Hello";
    names(wish);
}



    static void names(String wish){
    Student sd= new Student("SHADIL VV", 22, 'M');
        System.out.println(wish + "The given name is " + sd.name );
    }

}
class Student{
    String name;
    int age ;
    int mark1, mark2, mark3;
    char gender ;

    Student(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender= gender;

      totalmarks();
    }
    void totalmarks(){
        int total = mark1+mark2+mark3;
    }
}

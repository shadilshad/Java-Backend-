package method;

public interface constructormethod {
public static void main(String[] args) {
    Student sd= new Student("SHADIL VV", 22, 'M');
    String wish;
    System.out.println(sd.name);
}



    static void names(String wish){
        System.out.println("The given name is ");
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

package constructor;
public class Methodoverloading {
    public static void main(String[] args) {
        Students std = new Students(1, "SHADIL", 22, 8921860934L, 'M');
        System.out.println(std.name);
        
        Students std1 = new Students(2, "SHAREEFA", 55, 9048896420L, 'W' );
        System.out.println(std1.name);
    }
}
class Students{
    int id;
    String name;
    int age;
    double phone;
    char gender;
    Students(int id, String name, int age, double phone, char gender){
        this.id= id;
        this.name = name;
        this.age = age ;
        this.phone = phone;
        this.gender = gender;
    }
    Students(int id, String name, int age, double phone){
        this.id= id;
        this.name = name;
        this.age = age ;
        this.phone = phone;
        this.gender = 'U';
    }
}

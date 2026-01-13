import java.util.Scanner;
public class taskconstructor {
 public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);

    // parametrized
    student shado = new student(156,"SHADIL VV",88.4f,78.6f);
    System.out.println(shado.rollno + " : " + shado.name + " scored "+ shado.marks + " with CGPA of " + shado.CGPA);
    //default
    
    student names = new student();
    System.out.print("Write your name: ");
    names.name = sc.nextLine().toUpperCase();

    System.out.println(names.name);
     
 }   
}
class student{
    int rollno;
    String name;
    float marks;
    float CGPA;
//default constructor
    student(){
        this.rollno = 0;
        this.name = " ";
        this.marks = 0f;
        this.CGPA = 0f;
    }
// parametrized constructor
    student(int rollno, String name, float marks, float CGPA){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        this.CGPA = CGPA;

    }
}

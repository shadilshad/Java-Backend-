package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class ayn1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Student shado = new Student(156, "Shadil VV", 
        892186643, 86.5f, 78.7f, "CSE-C");
        System.out.println("Hi, Guys! My name is "+ shado.name + " (Roll No: " + shado.rollno+ 
        " )  and my phone numnber is "+ shado.phone + " i scored "+ shado.marks + " with the CGPA of "+shado.CGPA);
        do{
        Student rohan = new Student();
        System.out.println("Write details of the students: ");
        rohan.name = sc.nextLine().toUpperCase();
        System.out.println(rohan.name);
        }while(true);
    }
    
}
class Student{
    int rollno;
    String name;
    int phone;
    float marks;
    float CGPA;
    String classroom;
// parametrized constructor
    Student(int rollno, String name, int phone, float marks,float CGPA, String classroom){
        this.rollno = rollno;
        this.name = name;
        this.phone =phone;
        this.marks = marks;
        this.classroom = classroom;
    }
//default constructor
    Student(){
         this.rollno = 0;
        this.name = " ";
        this.phone = 0; 
        this.marks = 0f;
        this.classroom = " ";
    }
}

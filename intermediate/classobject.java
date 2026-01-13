public class classobject{
    public static void main(String[] args){
     
        Students shadil = new Students();
        shadil.rolno = 156;
        shadil.name = "Shadil Vadakke Veetil";
        shadil.marks = 89.5f;
        shadil.CGPA = 7.83f;

        System.out.print("The roll number "+ shadil.rolno + " named " + shadil.name + " has scored the marks of "
            +shadil.marks + " with the CGPA of "+ shadil.CGPA);
        

    }
}
class Students{
    int rolno;
    String name;
    float marks;
    float CGPA;
}
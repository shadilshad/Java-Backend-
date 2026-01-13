public class Parametarizedconstructor {
    public static void main(String[] args) {
        
        students shado = new students(156, "SHADIL VV",88.4f,7.82f);
        System.out.println(shado.rolno);
    }
}
class students{
    int rolno;
    String name;
    float marks;
    float CGPA;

    students(int rolno, String name, float marks, float CGPA){
        this.rolno = rolno;
        this.name = name;
        this.marks = marks;
        this.CGPA = CGPA;


    }
}

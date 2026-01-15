public class defaultconstructor {
    public static void main(String[] args) {
   students shado = new students();
       shado.rolno = 156;

   System.out.println(shado.rolno);
    }
}
class students{
    int rolno;
    String name;
    float marks;
    float CGPA;

    students(){
        this.rolno =0;
        this.name=" ";
        this.marks=0f;
        this.CGPA = 0f;
    }

}


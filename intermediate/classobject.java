public class classobject {
    public static void main(String[] args) {
        Students shado = new Students();
        shado.rolno = 156;
        System.out.println(shado.rolno);
    }
}

class Students {
    int rolno;
    String name;
    float marks;
    float CGPA;
}

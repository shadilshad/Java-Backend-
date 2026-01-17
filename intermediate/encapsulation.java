public class encapsulation {
    public static void main(String[] args) {
        Students shado = new Students(156, "SHADIL VV", 88.4f, 7.82f);

        // Access private variables using getters
        System.out.println("Roll Number: " + shado.getRolno());
        System.out.println("Name: " + shado.getName());
        System.out.println("Marks: " + shado.getMarks());
        System.out.println("CGPA: " + shado.getCGPA());

        // Example of using setter
        shado.setMarks(90.5f);
        System.out.println("Updated Marks: " + shado.getMarks());
    }
}

class Students {
    private int rolno;
    private String name;
    private float marks;
    private float CGPA;

    // Constructor
    Students(int rolno, String name, float marks, float CGPA){
        this.rolno = rolno;
        this.name = name;
        this.marks = marks;
        this.CGPA = CGPA;
    }

    // Getters
    public int getRolno() { return rolno; }
    public String getName() { return name; }
    public float getMarks() { return marks; }
    public float getCGPA() { return CGPA; }

    // Setters
    public void setRolno(int rolno) { this.rolno = rolno; }
    public void setName(String name) { this.name = name; }
    public void setMarks(float marks) { this.marks = marks; }
    public void setCGPA(float CGPA) { this.CGPA = CGPA; }
}

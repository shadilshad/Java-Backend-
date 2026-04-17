class Info {
    private String name;
    private String school;
    private int age;
    private int year;

    // Constructor
    Info(String name, String school, int age, int year) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.year = year;
    }

    // Getters
    public String getname() {
        return name;
    }

    public String getschool() {
        return school;
    }

    public int getAge() {
        return age;
    }

    public int getyear() {
        return year;
    }

    // Setters (FIXED)
    public void setname(String name) {
        this.name = name;
    }

    public void setschool(String school) {
        this.school = school;
    }

    public void setage(int age) {
        this.age = age;
    }

    public void setyear(int year) {
        this.year = year;
    }
}

public class Encapsulationn {
    public static void main(String[] args) {
        Info in = new Info("shadil", "PKMMHSS Edarikode", 10, 2018);

        System.out.println(in.getname());
        System.out.println(in.getschool());
        System.out.println(in.getAge());
        System.out.println(in.getyear());
    }
}
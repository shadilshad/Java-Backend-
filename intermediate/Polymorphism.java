class Main {
    public static void main(String[] args) {

        Polymorphism obj1 = new A();   // parent reference → child A object
        Polymorphism obj2 = new B();   // parent reference → child B object

        obj1.go();   // calls A's version
        obj2.go();   // calls B's version
    }
}

public class Polymorphism {
     void go(){
        System.out.println("Hey! my name is punda murshi");
     }
}
class A extends Polymorphism{
    @Override
    void go(){
        System.out.println("Hey! my name is thaayoli murshi");    
    }
}
class B extends Polymorphism{
    @Override
    void go(){
        System.out.println("Hey! my name is thaayoli murshi");    
    }
}

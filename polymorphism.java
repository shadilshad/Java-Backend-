/* Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

*/
class Shape{
    public void draw(){
          System.out.println("Do you know how to draw?");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Its circle here!");
    }
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("Its rectangle here!");
    }
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("Now triangle oh?");
    }
}
public class Polymorphism{
    public static void main(String []args){
        Shape om;

        om = new Circle();;
        om.draw();

        om = new Rectangle();
        om.draw();

        om = new Triangle();
        om.draw();

    }
}
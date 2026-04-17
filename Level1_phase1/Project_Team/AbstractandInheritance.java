abstract class Meow{
    public void Play(){
        System.out.println("Hello Kootukkaare");
    }
    protected void Name(){
        System.out.println("Shadil");
    }
}
public class AbstractandInheritance extends Meow {
    public static void main(String[] args) {
        Meow obj = new AbstractandInheritance();

        obj.Play();
        obj.Name();
    }
    
}

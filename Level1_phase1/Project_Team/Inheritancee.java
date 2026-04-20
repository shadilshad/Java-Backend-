class Animals{
    void sound(){
        System.out.println("Brrrrrrrrrr!!");
    }
}
public class Inheritancee extends Animals {
    public static void main(String[] args) {
        Inheritancee obj = new Inheritancee();
        obj.sound();
    }
    
}

abstract class Helo {         
    void turnOn() {
        System.out.println("Turning it on");
    }
}
class melo extends Helo{

}

class abstracts extends Helo { 

    public static void main(String[] args) {

        abstracts obj = new abstracts(); 
         obj.turnOn(); 

         melo obj1 = new melo();
         obj1.turnOn();
    }
}

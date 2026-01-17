    //super is used to refer to the parent class object from a child class.
    //Think like this:  this → current (child) class 
    //                   super → parent class

public class superkeyword {
    int x = 10;
      public static void main(String[] args) {
        child obj = new child();
        obj.show();

      }  
}
class child extends superkeyword{

    int x =20;

    void show(){
    System.out.println(x);
    System.out.println(super.x);
    }
}

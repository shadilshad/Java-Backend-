// when the code is in inside of class then its a method, if its outside then thats a function. but since evertrhing
//is inside of class in java, java has only methods.
public class methodss{
    public static void main(String[] args){
    

        int a;
        int b;
        System.out.println("Hey guys, method is here!");
        int result = method(10,20);
        System.out.println("sum is: " + result);

    }
    public static int method(int a, int b){
       int c = a+b;
       return c;
    }
}
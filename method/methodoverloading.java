package method;

public class methodoverloading {

    public static void main(String[] args){

        methodoverloading obj = new methodoverloading();
        int a = 10;
        int b = 20;
        int c = add(a, b);
        System.out.println(c);
        int d=20;
        add(d);
        System.out.println(d);
    }


    static int add(int a, int b){
         int c = a+b;
         return c;
    }
    static int add(int d){
             return d;
    }
}

package method;

public class Returnmethod{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = add(a,b);
        String text = "Vadakke veetil";
        System.out.println(c);
        System.out.println(sentence(text));
        System.out.println();
    }

    public static int add(int a , int b){
        int c = a+b;
        return c;
    }
    public static String sentence(String text){
        return text;
    }}
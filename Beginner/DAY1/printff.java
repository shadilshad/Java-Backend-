public class printff{
    public static void main(String[] args) {
        
//printf() = is a method used to format output
// %[flag][width][.precision][specificc-character]
    
        String name = "shadil";
        int age = 22;
        double height = 170.7;
        boolean Employed =  false;


        System.out.printf("So your name is %s\n ", name);
        System.out.printf("i didnt know that you were %d\n", age," old");
        System.out.printf("oh you are  %f\n", height);
        System.out.printf("i didnt know that you were unemployed %b\n", Employed);
   
    }
}
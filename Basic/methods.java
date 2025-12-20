public class Methods{
    public static void main(String[] args){
        System.out.println("Message 1");
        Sayhello();
        System.out.println("Message 2");
        int result = sum(4,10);
        System.out.println("The givem calculatios actually calculated as " + result);
        int result2 = randsum(12,11);
        System.out.println("The sum of values " + result2);
         int final_result = sum(result, result2);
        System.out.println(final_result);
    }


    public static void Sayhello(){
        System.out.println("Hey, my text comes after message 1");
    }
        
    public static int sum(int x, int y){
            int sum= x + y;
            return(sum);
    }
    public static int randsum(int z, int k){
        int randsum= z-k;
        return(randsum);
    }
}
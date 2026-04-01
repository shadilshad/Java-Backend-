public class forloop {
    public static void main(String[] args) throws InterruptedException
{
        int time = 10;

        for(int i=time; i>0 ; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year");
    }
}

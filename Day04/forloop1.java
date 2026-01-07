import java.util.Scanner;
public class forloop1{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pick a number from 1 - 5 ");
        int numba = sc.nextInt();
        sc.nextLine();
        int sandy = 10;
        for(int i=numba ; i<5; i++){
            System.out.println("Annachi, sandy");
        }
        System.out.println("Surpriseeee! Nothing girlyy");
        System.out.println("Click the Enter Button");

        sc.nextLine();
        System.out.println("Ehehe gotta tell you something now!");
        for(int j=sandy ; j>0; j--){
            System.out.println(j);
            Thread.sleep(1000);
        }
        System.out.println("you know what, I lub you okay..");
    }
}

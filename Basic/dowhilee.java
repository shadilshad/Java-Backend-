import java.util.Scanner;

/* do{condition } while(ethre vennam enn)*/
    public class Dowhilee{
           public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a value below 20: ");
            int m = sc.nextInt();

            do{
                if(m<20){
                System.out.println("the next number is "+m+" for reaching to 20" );
                }
                else if(m==20){
                System.out.println("thats the same number "+m+" as 20" );
                }
                else{
                    System.out.println("Invalid Numbers");
                }
                m++;
            }
            while(m<=20);
                
                Christmas ch = new Christmas();
                ch.christ();
           }
    }
    class Christmas extends Dowhilee {
          void christ(){
                int Chri = 4;
                System.out.println("The new Year starts in : ");

            do{ 
                System.out.println(Chri);
                Chri --;
            }
            while(Chri>0);
                            System.out.print("happy new year");

          }
    }

    

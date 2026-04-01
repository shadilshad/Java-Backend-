import java.util.Scanner;
public class nestedloopmatrixgame{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
      
        int Column ;
        int rows;
        char symbol;
        System.out.print("How many columns? ");
        Column = sc.nextInt();

        System.out.print("How many rows? ");
        rows = sc.nextInt();
  
        System.out.print("Which symbol? ");
        symbol = sc.next().charAt(0);

        for(int i=0; i<rows ; i++){
            for(int j=0; j<Column;j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        sc.close();


    }
}

// its OFTENN USED IN DATA STRUCTURE
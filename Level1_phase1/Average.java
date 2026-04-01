import java.util.Scanner;
public class Average {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
   
        System.out.println("How many students are there? ");
        int std = sc.nextInt() ;
        System.out.println("How many subjects? ");
        int subj = sc.nextInt();
        sc.nextLine();

        for(int i=0; i< std; i++){
            System.out.println("Subject Name " + (i+1));
       }





                   String subject = sc.nextLine().toLowerCase();
            System.out.println("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();
 
      
        sc.close();
    }
    
}

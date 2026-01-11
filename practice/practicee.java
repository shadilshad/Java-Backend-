package practice;

public class practicee {
    public static void main(String[] args) {
        
        int[] marks = {45, 67, 89, 34, 90, 72, 50, 28};
 
        for(int i=0; i<marks.length ; i ++){
            System.out.println("Students " +(i+1)+ ": "+ marks[i]);
        }
        int total = 0;
        for(int koot : marks) total += koot;
        System.out.println("The total marks obtained by the class: " + total);

        double average =(double) total / marks.length;
        System.out.println("The average marks of the class: "+ average);
        
        
        int pass_count =0;
        int fail_count = 0;

        for(int mark : marks){
            if(mark >= 50 ) pass_count ++;
            else fail_count ++ ;
        }

        System.out.println("The number of students passed: "+ pass_count);
        System.out.println("The number of students failed: "+ fail_count);
        
        for(int i=0;i<marks.length;i++){
            String status = (marks[i] >= 50)? "PASSED" : "FAILED" ;
        System.out.println("Students " + (i+1) + ": " + marks[i] +" - " + status );
        }

        

        int max = marks[0];
        int min= marks[0];

        for(int p : marks){
            if(p > max) max = p;
            if(p < min) min = p;
        }
        System.out.println("The highest marks: "+ max);
        System.out.println("The lowest marks: "+ min);
    }
    
}

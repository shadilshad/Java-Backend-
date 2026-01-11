import java.util.Scanner;

public class PracticeUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter marks for student " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Print marks
        for(int i=0; i<marks.length ; i ++){
            System.out.println("Student " +(i+1)+ ": "+ marks[i]);
        }

        // Total & Average
        int total = 0;
        for(int mark : marks) total += mark;
        double average = (double) total / marks.length;
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);

        // Pass/Fail
        int pass_count = 0, fail_count = 0;
        for(int mark : marks){
            if(mark >= 50) pass_count++;
            else fail_count++;
        }
        System.out.println("Passed: " + pass_count);
        System.out.println("Failed: " + fail_count);

        // Individual status
        for(int i=0;i<marks.length;i++){
            String status = (marks[i] >= 50)? "PASSED" : "FAILED";
            System.out.println("Student " + (i+1) + ": " + marks[i] + " - " + status );
        }

        // Max/Min
        int max = marks[0], min = marks[0];
        for(int mark : marks){
            if(mark > max) max = mark;
            if(mark < min) min = mark;
        }
        System.out.println("Highest marks: " + max);
        System.out.println("Lowest marks: " + min);

        sc.close();
    }
}

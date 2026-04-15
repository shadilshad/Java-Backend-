import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        int number;
        int Sub;

        Scanner sc = new Scanner(System.in);

        System.out.print("How many Students are there? ");
        number = sc.nextInt();

        System.out.print("How many Subjects? ");
        Sub = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < Sub; j++) {
                System.out.print("Enter Subject Name: ");
                String subj = sc.nextLine();

                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();
                sc.nextLine(); // clear buffer

                System.out.println("Subject: " + subj + " | Marks: " + marks);
            }
        }
    }
}

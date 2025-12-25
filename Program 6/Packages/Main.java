package Packages;
import Packages.CIE.Personal;
import Packages.CIE.Internals;
import Packages.SEE.External;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students (n): ");
        int n = sc.nextInt();
        sc.nextLine();

        External[] students = new External[n];
        Internals[] internals = new Internals[n];

        System.out.println("\n--- Enter Student Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            System.out.print("Enter USN: ");
            String usn = sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Semester: ");
            int sem = sc.nextInt();

            System.out.print("Enter 5 Internal Marks: ");
            int[] im = new int[5];
            for (int j = 0; j < 5; j++) im[j] = sc.nextInt();
            internals[i] = new Internals(im);

            System.out.print("Enter 5 SEE Marks: ");
            int[] sm = new int[5];
            for (int j = 0; j < 5; j++) sm[j] = sc.nextInt();
            sc.nextLine();

            students[i] = new External(usn, name, sem, sm);
        }

        System.out.println("\n--- Final Marks ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent: " + (i + 1));
            students[i].display();
            internals[i].displayInternalMarks();
            students[i].displaySeeMarks();

            System.out.print("Total Marks: ");
            int[] total = new int[5];
            for (int j = 0; j < 5; j++) {
                total[j] = internals[i].getInternalMarks()[j] + students[i].getSeeMarks()[j];
                System.out.print(total[j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

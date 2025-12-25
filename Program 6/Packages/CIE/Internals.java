package Packages.CIE;

public class Internals {
    int[] InternalMarks= new int[5];

    public Internals(int[] marks) {
        if (marks.length == 5) {
            InternalMarks = marks;
        } else {
            System.out.println("Error: Exactly 5 course internal marks required!");
        }
    }
    public void displayInternalMarks() {
        System.out.print("Internal Marks: ");
        for (int m : InternalMarks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }
}

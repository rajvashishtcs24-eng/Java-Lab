package Packages.SEE;

public class External extends Packages.CIE.Personal {
    int[] seeMarks = new int[5];

    public External(String usn, String name, int sem, int[] marks) {
        super(usn, name, sem);
        if (marks.length == 5) {
            seeMarks = marks;
        } else {
            System.out.println("Error: Exactly 5 SEE marks required!");
        }
    }

    public void displaySeeMarks() {
        System.out.print("SEE Marks: ");
        for (int m : seeMarks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }
}

package Packages.CIE;

public class Personal {
    String name;
    String usn;
    int sem;

    public Personal(String name, String usn, int sem) {
        name = this.name;
        usn = this.usn;
        sem = this.sem;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Usn: " + usn);
        System.out.println("Sem: " + sem);
    }
}

import java.util.Scanner;
class WrongAge extends Exception {
    WrongAge(String msg) {
        super(msg);
    }
}
class Father {
    int age;
    Father(int age) throws WrongAge {
        if (age < 0)
            throw new WrongAge("Father age cannot be negative");
        this.age = age;
    }
}
class Son extends Father {
    int sonAge;
    Son(int fAge, int sAge) throws WrongAge {
        super(fAge);
        if (sAge >= fAge)
            throw new WrongAge("Son age must be less than father age");
        this.sonAge = sAge;
    }
}
public class InheritanceException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Father Age: ");
            int fAge = sc.nextInt();
            System.out.print("Enter Son Age: ");
            int sAge = sc.nextInt();
            Son s = new Son(fAge, sAge);
            System.out.println("Valid ages entered");
        } catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}

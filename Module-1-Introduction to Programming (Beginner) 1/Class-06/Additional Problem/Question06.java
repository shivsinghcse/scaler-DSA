import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the marks of class A: ");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        System.out.println("enter the marks of class B: ");
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        sc.close();
        double av = (a1 + a2) / 2.0;
        double bv = (b1 + b2) / 2.0;
        if (av > bv) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}

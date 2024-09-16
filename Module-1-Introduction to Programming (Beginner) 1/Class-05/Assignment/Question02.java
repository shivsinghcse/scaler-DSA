import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int n1 = scn.nextInt();
        System.out.println("Enter 2nd number: ");
        int n2 = scn.nextInt();
        System.out.println("Enter 3rd number: ");
        int n3 = scn.nextInt();
        scn.close();

        System.out.println("Number 1 is " + n1);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);

        System.out.println("(n1 < n2) condition is " + (n1 < n2));
        System.out.println("(n2 == n3) condition is " + (n2 == n3));
        System.out.println("(n1 < n2) && (n2 == n3) condition is " + ((n1 < n2) && (n2 == n3)));
    }
}

import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = scn.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = scn.nextInt();
        scn.close();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int n = scn.nextInt();
        System.out.println("Enter the 1st number: ");
        int x = scn.nextInt();
        scn.close();

        if (n % x == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

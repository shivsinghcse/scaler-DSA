import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int a = scn.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = scn.nextInt();
        System.out.println("Enter the  3rd number : ");
        int c = scn.nextInt();
        scn.close();

        int result = (a + b) % c;
        System.out.println("Remainder : " + result);
    }
}

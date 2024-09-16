import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String str = scn.nextLine();
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        scn.close();
        System.out.println(n + " " + str);
    }
}

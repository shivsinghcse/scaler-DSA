import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = scn.nextInt();
        scn.close();

        x *= 5;
        x += 10;
        x /= 2;
        System.out.println(x);
    }
}

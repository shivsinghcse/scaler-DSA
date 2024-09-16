import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter total classes: ");
        int tc = scn.nextInt();
        System.out.println("Enter total attend classes: ");
        int tp = scn.nextInt();
        scn.close();

        int result = (tp / tc) * 100;
        if (result >= 75) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

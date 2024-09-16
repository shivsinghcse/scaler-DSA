import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        sc.close();

        if (age >= 13) {
            System.out.println("You can ride the roller coaster.");
        } else {
            System.out.println("You can't ride the roller coaster.");
        }
    }
}

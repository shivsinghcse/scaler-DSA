import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price : ");
        int c = sc.nextInt();
        System.out.println("Enter the selling price: ");
        int s = sc.nextInt();
        sc.close();

        if (s > c) {
            System.out.println(1);
            System.out.println(s - c);
        } else {
            System.out.println(-1);
            System.out.println(s - c);
        }

    }
}

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of employee: ");
        String name = sc.nextLine();
        System.out.println("Enter the year of service: ");
        int year = sc.nextInt();
        sc.close();
        if (year > 5) {
            System.out.println("Yes " + name + " will recieve bonus.");
        } else {
            System.out.println("Yes " + name + " will recieve bonus.");
        }
    }

}

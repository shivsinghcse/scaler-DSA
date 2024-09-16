import java.util.*;

public class Question01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        long a = scn.nextInt();
        System.out.println("Enter 2nd number :");
        int b = scn.nextInt();
        scn.close();

        long ans = a * b;

        System.out.println(ans);
    }
}

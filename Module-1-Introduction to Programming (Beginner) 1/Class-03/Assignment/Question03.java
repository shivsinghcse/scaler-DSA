import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enetr 1st number:");
        int a = scn.nextInt();
        System.out.println("enetr 2nd number:");
        int b = scn.nextInt();
        System.out.println("enetr 3rd number:");
        int c = scn.nextInt();
        scn.close();
        int sum = a + b + c;
        System.out.println("Sum is : " + sum);
    }

}

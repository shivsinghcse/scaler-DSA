import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length :");
        int length = scn.nextInt();
        System.out.println("Enter the breadth :");
        int breadth = scn.nextInt();
        scn.close();

        int area = length * breadth;

        System.out.println("Area of Rectangle: " + area);
    }
}

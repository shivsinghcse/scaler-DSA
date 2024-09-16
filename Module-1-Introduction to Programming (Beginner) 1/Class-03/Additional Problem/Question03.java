import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of bill : ");
        int amout = scn.nextInt();
        System.out.println("Enter the no of bills : ");
        int totalBills = scn.nextInt();
        scn.close();

        int totalBill = amout * totalBills;
        System.out.println("Total bill amount : " + totalBill);
    }
}

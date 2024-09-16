import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the amount before exchange: ");
        int amt = scn.nextInt();
        System.out.println("Enter the amount after expense: ");
        int expense = scn.nextInt();
        scn.close();

        int saving = amt - expense;

        System.out.println("Savings : " + saving);
    }
}

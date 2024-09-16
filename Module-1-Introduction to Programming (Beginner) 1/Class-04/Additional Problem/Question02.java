import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter total bill amount : ");
        float totalBillamount = scn.nextFloat();
        System.out.println("Enter single bill amount : ");
        int singleBillamount = scn.nextInt();
        scn.close();

        int numberOfBills = (int)totalBillamount / singleBillamount;

        System.out.println(numberOfBills);

    }    
}

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();
        scn.close();

        if (num > 18) {
            System.out.println("N is greater than 18");
        } else if (num < 18) {
            System.out.println(" N is less than 18");
        }else{
            System.out.println("N is equal to 18");
        }
    }
}

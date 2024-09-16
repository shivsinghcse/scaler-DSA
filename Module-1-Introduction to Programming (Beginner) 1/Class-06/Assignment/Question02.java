import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the 1st side of triangle: ");
        int a = scn.nextInt();
        System.out.println("Enter the 2nd side of triangle: ");
        int b = scn.nextInt();
        System.out.println("Enter the 3rd side of triangle: ");
        int c = scn.nextInt();
        scn.close();

        if((a+b+c) == 180){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}

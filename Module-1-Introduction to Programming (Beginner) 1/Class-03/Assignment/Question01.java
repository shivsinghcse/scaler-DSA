import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the time: ");
        int time = scn.nextInt();
        scn.close();
        int remTime = 40 - time;
        System.out.println("Lasagna still needs to bake for : "+ remTime + " minutes");
    }

}
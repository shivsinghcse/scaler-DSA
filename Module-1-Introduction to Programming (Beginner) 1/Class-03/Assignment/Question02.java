import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of layers you want to add your lasagna :");
        int layer = scn.nextInt();
        scn.close();
        int time = layer * 2;
        System.out.println("Total time to prepare lasagna : "+ time);
    }
}

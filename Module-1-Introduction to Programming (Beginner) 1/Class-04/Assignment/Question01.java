import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of layers :");
        int layers = scn.nextInt();
        System.out.println("Enter the time the lasagna has already spent baking in the oven : ");
        int time = scn.nextInt();
        scn.close();

        int cookingTime = layers * 2 + time;
        System.out.println(cookingTime);
    }
}

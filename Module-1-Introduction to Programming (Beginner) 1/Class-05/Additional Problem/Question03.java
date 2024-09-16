import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enetr the Number: ");
        int side = scn.nextInt();
        scn.close();

        side++;
        int volume = side * side * side;
        System.out.println(side);
        System.out.println(volume);
    }
}

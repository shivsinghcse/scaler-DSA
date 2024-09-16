import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        double temp = scn.nextDouble();
        scn.close();

        if (temp >= 85.0 && temp <= 91.0) {
            System.out.println("Serious Hypothermia");
        }
        if (temp > 91.0 && temp < 95.0) {
            System.out.println("Mild Hypothermia");
        }
        if (temp >= 95.0 && temp <= 98.0) {
            System.out.println("Normal Temperature");
        }
        if (temp > 98.00 && temp < 100.0) {
            System.out.println("Mild Fever");
        }
        if (temp > 100.0 && temp <= 105.0) {
            System.out.println("High Fever");
        }
    }
}

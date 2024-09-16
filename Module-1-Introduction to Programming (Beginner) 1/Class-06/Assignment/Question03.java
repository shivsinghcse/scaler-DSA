import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();
        scn.close();

        if(num > 0){
            System.out.println(1);
        }else if(num < 0){
            System.out.println(-1);
        }else{
            System.out.println(0);
        }
    }
}

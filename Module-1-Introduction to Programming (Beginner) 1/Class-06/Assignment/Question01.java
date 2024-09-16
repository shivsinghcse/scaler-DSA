import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scn.nextInt();
        scn.close();

        if(num % 2 == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }    
}

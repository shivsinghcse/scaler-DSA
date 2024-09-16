import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the runs: ");
        int run = sc.nextInt();
        sc.close();

        if(run >= 100){
            System.out.println("Century!!!");
        }else{
            System.out.println("Better luck next time!");
        }
    }
}

import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if(n % 5 ==0 && n % 11 == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}

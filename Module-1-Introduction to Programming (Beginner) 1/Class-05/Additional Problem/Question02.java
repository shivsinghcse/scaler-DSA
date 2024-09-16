import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no of apples Rahul has: ");
        int N = scn.nextInt();
        System.out.println("Enter no of apples Karan has: ");
        int M = scn.nextInt();
        scn.close();

        int k = N-5;
        M += 5;
        N *= 2;
        N += k;
        System.out.println(N+ " "+M); 
    }
}

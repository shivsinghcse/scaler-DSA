import java.util.Scanner;

public class Question09 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    sc.close();

    if(n>=0){
        if(n%2==0){
            System.out.println("Positive Even");
        }else{
            System.out.println("Positive Odd");
        }
    }else{
        if(n%2 == 0){
            System.out.println("Negative Even");
        }else{
            System.out.println("Negative Odd");
        }
    }

    // System.out.print("Number is ");
    // if(n > 0) {
    //     System.out.print("Positive ");
    // } else {
    //     System.out.print("Negative ");
    // }
    // System.out.print("and ");
    // if(n % 2 == 0) {
    //     System.out.println("Even");
    // } else {
    //     System.out.println("Odd");
    // }

}
    
}
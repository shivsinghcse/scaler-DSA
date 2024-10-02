import java.util.Scanner;

public class Question_3 {

    static int frequency(int[] arr, int b){
        int n = arr.length;
        int freq = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == b){
                freq++;
            }
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the k number: ");
        int b = sc.nextInt();
        System.out.println("Enter the "+ N+" element of Array: ");
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int result = frequency(arr, b);
        System.out.println("Frequency of "+ b + " in the array: " + result);
    }
}

/*
    Problem Description:
    Take input an array A of size N and write a program to print maximum and minimum elements of the input. The only line of the input would contain a single integer N that represents the length of the array followed by the N elements of the input array A.

    Problem constraints:
    1 <= N <= 1000
    1 <= A <= 1000

    Input Format:
    The first line contains a single integer N representing the length of the array A followed by N elements of the array A.

 */

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int N = sc.nextInt();
        int A[] = new int[N];

        System.out.println("Enter the "+ N+" element of Array: ");
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        sc.close();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<N; i++){
            if(A[i] > max){
                max = A[i];
            }
            if(A[i] < min){
                min = A[i];
            }
        }

        System.out.println(max + " " + min);      
    }
}

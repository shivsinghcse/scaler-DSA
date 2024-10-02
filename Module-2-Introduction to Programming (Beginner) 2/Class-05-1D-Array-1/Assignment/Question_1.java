/*
    Write a program to print sum of elements of the input array A of size N.

    Note: User is supposed to write a program from scratch to add the elements of the input array and print the result.

    Problem Constraints:

    1 <= N <= 1000
    1 <= A <= 1000

    Input Format:

    - The first integer N denotes the number of integers in the array.
    - The next N integers denotes the element of the array A.

    Output Format:

    A single integer containing sum of elements from the input array.
 */

import java.util.Scanner;

class Question_1 {
    static int sumOfArray(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int N = scn.nextInt();
        int[] A = new int[N];
        
        System.out.println("Enter the "+ N+" element of Array: ");
        for (int i = 0; i < N; i++) {
            A[i] = scn.nextInt();
        }
        scn.close();

        int result = sumOfArray(A);
        System.out.println("Sum of all elements: "+result);
    }
}
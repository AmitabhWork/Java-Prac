import java.util.Scanner;

/**
 * Created by amitabhs on 27/02/17.
 */

//Problem Statement:
//        Linear Search: Given an integer array and an element x, find if element is present in array or not. If element is present, then print index of its first occurrence. Else print -1.
//
//        Input:
//        First line contains an integer, the number of test cases ‘T’. Each test case should be an integer. Size of the array ‘N’ in the second line. In the third line, input the integer elements of the array in a single line separated by space. Element X should be inputted in the fourth line, i.e., after entering the elements of array. Repeat the above steps second line onwards for multiple test cases.
//
//        Output:
//        Print the output in a separate line returning the index of the element X. If the element is not present, then print -1.
//
//        Constraints:
//        1 <= T <= 100
//        1 <= N <= 100
//        1 <= Arr[i] <= 100
//
//        Example Input and Output for Your Program:
//
//        Input:
//        2
//        4
//        1 2 3 4
//        3
//        5
//        10 90 20 30 40
//        40
//        Output:
//        2
//        4
//        Explanation:
//
//        There are 2 test cases (Note 2 at the beginning of input)
//        Test Case 1: Input: arr[] = {1, 2, 3, 4},
//        Element to be searched = 3.
//        Output:  2
//        Explanation: 3 is present at index 2.
//
//        Test Case 2: Input: arr[] = {10, 90, 20, 30, 40},
//        Element to be searched = 40.
//        Output:  4
//        Explanation: 40 is present at index 4.
public class LinearSearch1 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        //input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            //input the size of the array
            int n = sc.nextInt();

            //Input the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            //Input the element to be searched
            int x = sc.nextInt();

            System.out.println(search(arr, n, x));
            t--;
        }
    }

    private static int search(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            //Return the index of the element if the element if found
            if (arr[i] == x) {
                return i;
            }

        }
        //return -1 if the element is not found
        return -1;
    }
}

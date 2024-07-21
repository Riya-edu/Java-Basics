/*Write a program to calculate and return the sum of absolute 
difference between the adjacent number in an array of positive 
integers from the position entered by the user.

Note : You are expected to write code in the findTotalSum function 
only which receive three positional arguments:

1st : number of elements in the array
2nd : array
3rd : position from where the sum is to be calculated

Example

Input
input 1 : 7
input 2 : 11 22 12 24 13 26 14
input 3 : 5

Output
25 */

import java.util.Scanner;

public class AbsoluteDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();

        System.out.println("Enter array elements:");

        int[] arr = new int[size];
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter position from where the sum is to be calculated");
        int target = sc.nextInt();

        int res = findTotalSum(arr, target);
        System.out.println(res);
    }

    public static int findTotalSum(int[] arr, int target){

        int difference = 0;
       int sum = 0;
        for(int i = target - 1; i < arr.length-1; i++){
           difference = Math.abs(arr[i+1] - arr[i]);
           sum += difference;
        }
        return sum;
        }
    }



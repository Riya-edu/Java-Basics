/*Write a program to return the difference between the count of 
odd numbers and even numbers.

Note : You are expected to write code in the countOddEvenDifference 
function only which will receive the first parameter as the number of 
items in the array and second parameter as the array itself. you are not 
required to take input from the console.

Example
Finding the difference between the count of odd and even numbers from a 
list of 5  number

Input
input 1 : 8
input 2 : 10 20 30 40 55 66 77 83

Output
-2 */
import java.util.*;

public class OddEveDiff {
    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
       System.out.println("Enter array size:");
        int size = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        countOddEvenDifference(arr, size);
    }

    public static void countOddEvenDifference(int[] arr, int size){
        int eveCount = 0;
        int oddCount = 0;
        int difference;
        for(int nums : arr){
            if(nums % 2 == 0){
                eveCount++;
            }
            else{
                oddCount++;
            }
        }
        difference = oddCount - eveCount;
        System.out.println("The difference from count of odd and even is: "+difference);
    }
}

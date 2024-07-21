import java.util.*;
public class Q1 {
    //Two Sums
/*
Given an array of integers nums and an integer target, return 
indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and 
you may not use the same element twice.
You can return the answer in any order.
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        System.out.println("Enter elements:");

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt(); 
        }

        System.out.println(arr);

        System.out.println("Enter target:");
        int target = sc.nextInt();
        twoSums(arr, target);

    }

    public static void twoSums(int[] arr, int target){
     
           for(int i = 0; i < arr.length; i++){
            int first = arr[i];
            int sec = arr[i+1];
            int sum = first + sec;

            if(sum == target){
                System.out.println();
            }
           }
                
            }
        }
    


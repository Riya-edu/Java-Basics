/*
 Write a program to find the difference between the elements at odd 
 index and even index.

Note : You are expected to write code in the findDifference function 
only which receive the first parameter as the numbers of items in the 
array and second parameter as the array itself. You are not required to 
take the input from the console.

Example

Finding the maximum difference between adjacent items of a list of 5 
numbers

Input
input 1 : 7
input 2 : 10 20 30 40 50 60 70

Output
40

Explanation
The first parameter 7 is the size of the array. Sum of element at even 
index of array is 10 + 30 + 50 + 70 = 160 and sum of elements at odd index
 of array is 20 + 40 + 60 = 120. The difference between both is 40


 */
import java.util.*;

public class FindDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();

        System.out.println("Enter array elements:");

        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
         }

         int ans = findDifference(array);
         System.out.println(ans);
        

    }
        public static int findDifference(int[] array){

            int eveSum = 0;
            int oddSum = 0;
            int diff = 0;

            for(int i = 0; i < array.length; i++){
                if(i % 2 == 0){
                    eveSum += array[i];
                }
                else{
                    oddSum += array[i];
                }
            }

            diff = eveSum - oddSum;

            return diff;
        }
    
}

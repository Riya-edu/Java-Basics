/*
 Note : You are expected to write code in the findTotalCurtains 
 function only which receive the first parameter as the number of 
 items in the array and second parameter as the array itself. You 
 are not required to take the input from the console.

Example

Finding the total curtains from a list of 5 cloth pieces.

Input
input 1 : 5
input 2 : 3 42 60 6 14

Output
9
 */

 import java.util.*;

public class findTotalCurtains {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();

        System.out.println("Enter array elements:");

        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
         }

         findTotalCurtains(array);

    }

    public static void findTotalCurtains(int[] array){
        double curtainsCount = 0;
        double count = 0;
        for(int nums : array){
           count = Math.floor(nums / 12);
            curtainsCount = curtainsCount + count;
            
        } 
        System.out.println(curtainsCount);

    }
}

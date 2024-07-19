
import java.util.*;

/*
 You are given a list of daily prices of a stock. 
 You can buy a stock on one day and sell it later on another 
 day after the day you bought the stock. You can perform the 
 above operation only once. What is the maximum loss possible?
Example

Prices=[10,4,2,9]

The greatest loss is incurred when you buy at a price of 10 and 
sell at a price of 2. Return the difference:9.

Example

Price=[1,2,3,4]

The Price went up every day. Return 0.
 */

/*
* You need to find two days i and j such that i < j and 
  the difference Prices[i] - Prices[j] is maximized.
* Iterate through the list of prices to keep track of the 
minimum price seen so far and calculate the possible loss for
 each subsequent day.
* Keep track of the maximum loss encountered during this iteration.
 */

public class Stocks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n = sc.nextInt(); // Get array size

        int[] array = new int[n];   //Initialize array

        System.out.println("Enter Array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();    // enter elements in array
        }

        ArrayList<Integer> list = new ArrayList(); //Initialize arraylist
        for (int i = n - 2; i >= 0; i--) //roll the loop from second last ele
            list.add(array[i] - array[i + 1]);
            //array size = 5 || {2, 4, 10, 1}
            //perform (second last ele[3] - last ele[4])
            //([2] - [3])
            //([1] - [2])

            //List collects the diff between elements

            //Final List = 9, 6, -2

        int res = solve(list);

        if (res < 0)
            System.out.println(0);
        else
            System.out.println(res);

    }

    public static int solve(ArrayList <Integer> list){

        int n = list.size();
        // Edge Case 1: when the list is empty
        if( n == 0){
            return 0;
        }

        //Edge case 2: If max value is 0 return 0
        int max = list.get(0); // max = value at [0]
        for(int i = 0; i < n; i++)
            max = Math.max(max, list.get(i)); //compare values with max
        
        if(max <= 0){
            return 0;
        }

        // actual work

        int maxSum = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + list.get(i);
            // sum = 0 + 9 = 9;
            // sum = 0 + 6 = 6;
            // sum = 0 + -2 = -2 (0)
            if (sum < 0)
              sum = 0;
            maxSum = Math.max(maxSum, sum);
            // maxSum = 0, 9
            // maxSum = 9, 6
            // maxSum = 9, 0
          }
          return maxSum;
        }

    }


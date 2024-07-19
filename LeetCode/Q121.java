
//Best time to buy stock
import java.util.*;

public class Q121 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter Array Size:");

        int[] arr = new int[n];

    }

    public static int Prices(int[] arr) {
        int minPrice = Integer.MAX_VALUE; // Max value an int can be is defined so that 
        // any other value is smaller and can be saved for comparison
        int maxProfit = 0;  //Initializing to add the profit

        for (int price : arr) { //looping
            if (price < minPrice) { //if ele is < int.max val it is set in minprice
                minPrice = price;
            }

            int profit = price - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

}

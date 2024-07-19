//Define two methods to print the maximum and the minimum number 
//respectively 
//among three numbers entered by the user.

import java.util.Scanner;

public class MinMaxMethod {
    
   public static int Min(int a, int b, int c){
        int min = Math.min(a, Math.min(b, c));
        return min;
    }

   public static int Max(int a, int b, int c){
        int max = Math.max(a, Math.max(b, c));
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        System.out.println("Enter your third number: ");
        int c = sc.nextInt();

        int max = Max(a, b, c);
        int min = Min(a, b, c);
        System.out.println("Max value is: "+ max);
        System.out.println("Min value is: "+ min);
    }

}

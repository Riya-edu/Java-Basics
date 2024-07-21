//Perfect Squares in an array

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();

        System.out.println("Enter array elements:");

        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
         }
         findPerfectSquare(array);

    }

    public static void findPerfectSquare(int[] array){

        double sqrt;
        int count = 0;
        for(int nums : array){
            sqrt = Math.sqrt(nums);
            if(sqrt - Math.floor(sqrt)==0){
                count++;
            }
        }
        System.out.println(count);
    }
}

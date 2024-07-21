import java.util.Scanner;

public class MinMaxArr {
    public static int stockMin(int[] array){
        
      
        int min = array[0];

        for(int num : array){
            if(num < min){
                min = num;
            }
        }
      return min;
    }

    public static int stockMax(int[] array){
        int max = array[0];
        for(int nums: array){
            if(nums > max){
                max = nums;
            }
        }
        return max;
    }

    public static int check(int[] array){
        int difference = stockMax(array) - stockMin(array);
        return difference;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Array Size:");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter values:");

        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        int differ = check(array);
        System.out.print(differ);
        int max = stockMax(array);
        System.out.println(max);

    }

}




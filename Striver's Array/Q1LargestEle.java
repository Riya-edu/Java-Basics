import java.util.Scanner;

// Find the largest element within an array

public class Q1LargestEle {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ar = new int[n];

        for(int i = 0; i <n ; i++){
            ar[i] = sc.nextInt();
        }
        int ans = LargestEle(ar);
        System.out.println(ans);

    }

    public static int LargestEle(int[] ar){
        int max = 0;
        for(int num : ar){
            if(max < num){
                max = num;
            }
        }
        return max;
    }
}

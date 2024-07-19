import java.util.Scanner;

public class EvenOdd {
    public static void evenodd(int n){
        if(n%2 == 0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }

    public static void check(int[] nums){
        for(int num : nums){
            evenodd(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check: ");
        int count = 5;

        int[] n = new int[count];

        for(int i = 0; i < count; i++){
             n[i] = sc.nextInt();
        }

        check(n);
    }
}

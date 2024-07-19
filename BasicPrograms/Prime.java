import java.util.Scanner;

public class Prime{


    static void checkPrime(int n){
        if( n <= 1){
            System.out.println("Number is not Prime");
        }

        if(n == 2){
            System.out.println("Number is True Prime");
        }
        
        for(int i = 2; i <= Math.sqrt(n); i+=2){
            if(n % i == 0){
                System.out.println("Number "+ n + "not prime");
            }
            else{
                System.out.println("Number is Prime");
            }
        }
    }

    //This method iterates through the array and calls the checkPrime function for each array element5
    static void checkPrime(int[] nums) {
        for (int num : nums) {
            checkPrime(num);
        }
    }
        
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of array: ");
        int count = sc.nextInt();

        int[] n = new int[count];
        System.out.println("Enter numbers in array: ");

        for(int i = 0; i < count; i++){
       
         n[i] = sc.nextInt();
        }

        checkPrime(n);
       

    }

        
}
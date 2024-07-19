import java.util.Scanner;

public class PrimeBtw {
    // Prime numbers between 2 numbers
    public static boolean Prime(int n) {   
        if(n < 1){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n % 2 == 0){
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                   return false;
                }
            }
        return true;
    }
    public static void isPrime(int a, int b){
        System.out.println("The Prime number between " + a + " and " + " b " + "is:");
            
        for(int i = a; i <= b; i++){
            if(Prime(i)){
                System.out.println(i + " ");
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        isPrime(a, b);
        
    }

}

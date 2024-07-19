import java.util.Scanner;


public class PalindromeNum {
    static int isPalindrome(int n) {
        
        int reverse = 0;
        while(n != 0){
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }
        return reverse;
       
    }

    public static void check(int n){
       if(isPalindrome(n) == n){
        System.out.println("Number is palindrome");
       }
       else{
        System.out.println("Not Palindrome");
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check palindrome: ");
        int n = sc.nextInt();

        check(n);
     
    }

}

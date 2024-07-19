import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int digit = sc.nextInt();

        while(digit != 0){
            int reverse = 0;

            reverse = reverse + digit % 10;
            digit = digit / 10;
            
            System.out.print(reverse);
        }
        
    }
}

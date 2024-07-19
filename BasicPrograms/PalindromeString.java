import java.util.Scanner;

public class PalindromeString {
    public static void Palindrome(){
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String original = sc.nextLine();

        int length = original.length();
       
        

        String reverse = "";
        for(int i = length - 1; i >= 0; i--){
           reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("Entered number is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}

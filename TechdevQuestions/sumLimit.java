/*Given 2 non-negative ints, a and b, return their sum, 
so long as the sum has the same number of digits as a. 
If the sum has more digits than a, just return a without b. 
(Note: one way to compute the number of digits of a non-negative 
int n is to convert it to a string with 
String.valueOf(n) and check the length of the string.) */

public class sumLimit {
   
    public static int Limit(int a, int b){
        int sum = a + b;
        String check = String.valueOf(sum);
        String num = String.valueOf(a);
          if (check.length() > num.length()){
            return a;
          }
          else{
            return sum;
          }
    }
    public static void main(String[] args) {
        System.out.println(Limit(8, 1));
    }
}

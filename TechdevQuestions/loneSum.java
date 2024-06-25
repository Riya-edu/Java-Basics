/*Given 3 int values, a b c, return their sum. 
However, if one of the values is the same as another of the 
values, it does not count towards the sum. */

public class loneSum{

    public static int LoneSum(int a, int b, int c){
        int sum;
        if( a==b ){
             sum = a + c;
        }
        else if( b==c ){
             sum = a + b;
        }
        else if( a==c ){
             sum = b + c;
        }
        else{
             sum = a + b + c;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println(LoneSum(8, 2, 1));
    }
}
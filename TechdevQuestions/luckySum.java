/*Given 3 int values, a b c, return their sum. 
However, if one of the values is 13 then it does not 
count towards the sum and values to its right do not count. 
So for example, if b is 13, then both b and c do not count. */

public class luckySum {
    
    public static int Lucky(int a, int b, int c){
        int sum;
       if (a==13){
         sum = 0;
       }
       else if (b==13){
         sum = a;
       }
       else if (c==13){
        sum = a + b;
       }
       else{
        sum = a + b + c;
       }
       return sum;
    }

    public static void main(String[] args) {
            System.out.println(Lucky(13, 2, 1));
            System.out.println(Lucky(2, 13, 1));
            System.out.println(Lucky(1, 2, 13));
            System.out.println(Lucky(1, 2, 3));
    }
}

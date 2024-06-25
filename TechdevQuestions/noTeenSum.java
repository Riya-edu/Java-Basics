/*Given 3 int values, a b c, return their sum. 
However, if any of the values is a teen -- in the range 13..19 
inclusive -- then that value counts as 0, except 15 and 16 do 
not count as teens. Write a separate helper "public int fixTeen(int n) 
{"that takes in an int value and returns that value fixed for the teen rule. 
In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). */

public class noTeenSum {
    
    public static int fixTeen(int n){
        if (n  >=13 && n<=19 && n!=15 && n!=16){
            return 0;
        }
        return n;
    }
    
    
    public static int sum(int a, int b, int c){
        a = fixTeen(a);
        b = fixTeen(b);
        c = fixTeen(c);
        int sum = a + b + c;
        return sum;
    }

    public static void main(String[] args) {
        int a = 1, b = 2, c = 13;

        System.out.println(sum(a, b, c));

       
    }

}

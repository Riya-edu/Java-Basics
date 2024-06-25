/* For this problem, we'll round an int value up 
to the next multiple of 10 if its rightmost digit is 5 or more, 
so 15 rounds up to 20. Alternately, round down to the previous 
multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. 
Given 3 ints, a b c, return the sum of their rounded values. To avoid code 
repetition, write a separate helper "public int round10(int num) 
{" and call it 3 times. 
Write the helper entirely below and at the same indent level as roundSum().*/ 

public class roundSum {
     public static int checkNum(int n){
        int remainder = n % 10;
        int quotient =  n / 10;
        

        if(remainder < 5){
           return quotient * 10;
        }
        else{
            return (quotient + 1) * 10;
        }
        
     }

     public static int sum(int a, int b, int c){
       
        int sum = checkNum(a) + checkNum(b) + checkNum(c);
        return sum;
     }


     public static void main(String[] args) {
        System.out.println();
        System.out.println(sum(4, 17, 18));
     }
}

/*Given 2 int values greater than 0, return whichever value is 
nearest to 21 without going over. 
Return 0 if they both go over.


blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19 */

public class blackjack {
    
    int a;
    int b;
    

    public static int checkValue(int a, int b){

        if(a > 21){
            return b <= 21 ? b : -1;
        }
        else if(b > 21){
            return a <= 21 ? a : -1;
        }
        if(Math.abs(21-a)< Math.abs(21-b)){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkValue(24, 16));
    }
}

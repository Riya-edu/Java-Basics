/*Given three ints, a b c, return true if one of b or c is "close" 
(differing from a by at most 1), while the other is "far", differing from both 
other values by 2 or more. 
Note: Math.abs(num) computes the absolute value of a number.*/
public class closeFar {
    public static boolean checkCloseFar(int a, int b, int c){
     if (Math.abs(b-a)<=1)
     {
        if(Math.abs(c-a)>=2){
            return true;
        }
        else {
            return false;
        }
    }
    if (Math.abs(c-a)<=1){
        if(Math.abs(b-a)>=2){
                return true;
            }
            else { 
                return false;
            }
        }   
        else {
            return false;
        }
     }

    

     public static void main(String[] args){
        System.out.println();
        System.out.println(checkCloseFar(2, 1, 10));
     }
    }
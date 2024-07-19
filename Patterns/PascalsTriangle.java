/*The first and last elements of each row are always 1.
Each interior element is the sum of the two elements 
above it from the previous row. */

public class PascalsTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
               

                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }  
            System.out.println();
        }
    }
}

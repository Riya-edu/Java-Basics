public class HollowDiamondStars {
    public static void main(String[] args) {

        int n = 5;
        System.out.println();
        // Upper Part
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {

                System.out.print("*");
            }
            for (int j = 0; j < (2 * i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // Lower Part
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (2 * (n - i - 1) + 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

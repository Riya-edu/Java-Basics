import java.util.Scanner;;

public class Pythagoriantriplet {
    public static void pytrip(int a, int b, int c){
         int sq1 = (int) Math.pow(a, 2);
         int sq2 = (int) Math.pow(b, 2);
         int sq3 = (int) Math.pow(c, 2);

         if((sq1 + sq2) == sq3){
            System.out.println("It's a Pythagorean triplet");
         }
         else if((sq2 + sq3) == sq1){
            System.out.println("It's a Pythagorean triplet");
         }
         else if((sq1 + sq3) == sq2){
            System.out.println("It's a Pythagorean triplet");
         }
         else{
            System.out.println("It's not a triplet");
         }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        pytrip(a, b, c);
    }

}

public class eveSpaceBoolean {
    
    public static Boolean isEvenlySpaced(int a, int b, int c){
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b,c));
        int medium = a + b+ c - smallest - largest;

        int space1 = largest - medium;
        int space2 = medium - smallest;

        if (space1 == space2){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isEvenlySpaced(2, 4, 6));
        System.out.println(isEvenlySpaced(6, 4, 2));
        System.out.println(isEvenlySpaced(4, 6, 3));
        System.out.println(isEvenlySpaced(4, 2, 9));
    }
}

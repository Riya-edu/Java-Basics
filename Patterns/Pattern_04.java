
public class Pattern_04 {
    public static void main(String[] args) {
       
        Pattern4(5);
    }

    static void Pattern4(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
        System.out.println();
        }

    }
}

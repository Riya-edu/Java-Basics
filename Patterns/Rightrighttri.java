public class Rightrighttri {
    public static void main(String[] args) {
        int n = 4;
        System.out.println();
        for(int i = 1; i <=n; i++){
            
            for(int s = i; s < n; s++ ){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

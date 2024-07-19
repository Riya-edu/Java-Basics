public class InvRightRightTri {
    public static void main(String[] args) {
        
   
    int n = 6;
    for(int i = 1; i<=n; i++){
        for(int j = i; j <=2*i-1; j++){
            System.out.print(" ");
        }
        for( int j = n; j >= i; j--){
            System.out.print("*");
        }
        System.out.println();
    }
}
}

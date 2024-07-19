public class InvHollowTri {
    public static void main(String[] args) {
        System.out.println();
        for(int i=1; i <= 11; i++){
            for(int j=11; j>= 11-i; j--){
                System.out.print(" ");
            }
            for(int j=11; j>=(2*i-1); j--){
                if(i==1 || j==11 | j==(2*i-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

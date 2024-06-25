public class Diamond {
    public static void main(String[] args) {
        int n = 3;

        for(int i = 0; i< n; i++){
            for(int s=i; s<= n-i-1; s++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

       
        for(int i = n; i >=n ; i++){
            for(int s=i; s>i; s++){
                System.out.print(" ");
            }
            for(int j=n; j>2*i+1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

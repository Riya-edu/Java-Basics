public class P10CompleteTri {
    public static void main(String[] args) {

        // Approach 1
        int n = 4;
        int m = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= m; i ++){
            for(int j = m; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
            
    

    //Approach 2 
    int s = 5;
    for(int i = 1; i <= 2*s-1; i++){
        int stars = i;
        if(i>s){
            stars = 2*s-i;
        }
        for(int j = 1; j <= stars; j ++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}



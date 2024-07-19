public class P14AlphabetTri {
    public static void main(String[] args) {
        int n = 3;
        System.out.println();
        for(int i = 0; i < n; i++){
            for(char j = 'A'; j <= 'A'+i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        } 
       }
}

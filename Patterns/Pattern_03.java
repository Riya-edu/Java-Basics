

public class Pattern_03 {
    public static void main(String[] args) {
        int n = 5;
        // here the number of rows is increasing but the number of cols is decreasing
        // so the for loop for rows will be same but the for loop for cols will start with highest val & keep decreasing.
        for(int i=1; i <= n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

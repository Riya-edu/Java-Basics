import java.util.Scanner;

public class NaturalSum {
  public static int Sum(int n){
    if(n == 0){
        return 0;
    }
    int sum = 1;

    for(int i = 1; i <= n; i++){
        sum +=  i;
    }
    return sum;
  }  

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n = sc.nextInt();

    
    int ans = Sum(n);
    System.out.println(ans);


  }
}

/*
Given three ints, a b c, one of them is small, one is medium and one is large.
Return true if the three values are evenly spaced, so the difference between 
small and medium is the same as the difference between medium and large.


evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false */

public class evenlySpaced{
    int a;
    int b;
    int c;
    int space1;
    int space2;

public evenlySpaced(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
}
public void check(){
    

    //Find the smallest number

    int smallest = Math.min(a, Math.min(b, c));

    //Find largest number

    int largest = Math.max(a, Math.max(b, c));

    //find medium number  (4,6,2)
    int medium;
    if(a != smallest || a != largest ){
        medium = a;
    }
    else if(b != smallest || b != largest){
         medium = b;
    }
    else{
        medium = c;
    }
    System.out.println();
    System.out.format("%d %d %d", smallest, medium, largest);
    System.out.println();
  int space1 = medium-smallest;
  int space2 = largest-medium;
  
    if(space1 == space2){
      System.out.println("true");
    }
    else{
      System.out.println("false");
    }
}    public static void main(String[] args){

    evenlySpaced eve = new evenlySpaced(4, 6, 2);
    
      eve.check();
}
}

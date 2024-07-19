public class Calculator {
    int first;
    int sec;

    public void add(){
       int add = (first + sec) ;
       System.out.println(add);
        
    }
    public void sub(){
       int sub = (first - sec) ;
       System.out.println(sub);
     }
     public void mul(){
        int mul = (first * sec) ;
        System.out.println(mul);
      }
    public void div(){
        int div = (first / sec) ;
        System.out.println(div);
      }

    public static void main(String[] args) {
       
       Calculator myCalc = new Calculator();

       myCalc.first = 18;
       myCalc.sec = 22;
       
        System.out.println("Addition: ");
        myCalc.add();

        System.out.println("multiplication: ");
        myCalc.mul();
        System.out.println("Substraction: ");
        myCalc.sub();
        System.out.println("Division: ");
        myCalc.div();
    }
}

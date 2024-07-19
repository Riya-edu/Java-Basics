public class Person {
    String name;
    String gender;
    int age;

    public void display(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
    }

    public static void main(String[] args){

        Person myPer1 = new Person();
        myPer1.name = "Abc";
        myPer1.age = 22;
        myPer1.gender= "Male";

        System.out.println("Person 1:");
        myPer1.display();
        
    }
}

// Define a class named "Car"

public class Car {

    // Define properties for class "Car"
    String make;
    String model; 
    int year;

    // Create a Constructor to initialize Class

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Create a method to display info

    public void display(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }

    // Create an object 

    public static void main(String[] args){

        Car myCar = new Car("Jaguar", "Model1", 2024);

        myCar.display();
    }
}

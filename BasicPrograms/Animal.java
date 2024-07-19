public class Animal {
    String species;
    String color;
    String voice;

    public void display(){
        System.err.println();
        System.out.println("Species:" + species);
        System.err.println();
        System.out.println("Color: " + color);
        System.err.println();
        System.out.println("Voice: " + voice);
        System.err.println();
    }

    public static void main(String[] args){
        Animal cat = new Animal();
        cat.species = "animal";
        cat.color = "white, black, orange";
        cat.voice = "meow";

        cat.display();

        Animal dog = new Animal();
        dog.species = "animal";
        dog.color = "white, black, brown";
        dog.voice = "woof";

        dog.display();

        Animal parrot = new Animal();
        parrot.species = "bird";
        parrot.color = "green";
        parrot.voice = "copies you";

        parrot.display();


    }

}

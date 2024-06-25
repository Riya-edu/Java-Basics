public class Book {

    String title;
    String author;
    int year;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void display(){
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Year Published: "+ year);
    }

    public static void main(String[] args) {
        Book myBook = new Book("Alchemist", "Idk", 2012);

        myBook.display();
    }
    
}

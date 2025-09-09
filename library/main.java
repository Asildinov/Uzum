
import java.util.ArrayList;

class Book {
    int id;
    String title;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        int nextId = 1;
       
        books.add(new Book(nextId++, "War and Peace"));
        books.add(new Book(nextId++, "Crime and Punishment"));

        System.out.println("Все книги:");
        for (Book b : books) {
            System.out.println(b.id + ": " + b.title);
        }

        
        int findId = 1;
        for (Book b : books) {
            if (b.id == findId) {
                System.out.println("Нашёл книгу: " + b.title);
            }
        }

        int deleteId = 1;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).id == deleteId) {
                books.remove(i);
                break;
            }
        }

        System.out.println("После удаления:");
        for (Book b : books) {
            System.out.println(b.id + ": " + b.title);
        }
    }
}

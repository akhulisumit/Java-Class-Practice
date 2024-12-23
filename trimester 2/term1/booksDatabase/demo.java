package booksDatabase;

import java.io.FileNotFoundException;

public class demo {
    public static void main(String[] args) {
        try {
            BookRepo repo = new BookRepo("D:\\Sumit Codes\\java classes\\trimester 2\\booksDatabase\\bestsellers with categories.csv");
            repo.printTitlesofAllBooks();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
